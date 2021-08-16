package com.example.demo.layer4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;
import com.example.demo.layer2.Docs;
import com.example.demo.layer2.Employment;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.BasicRepositoryImpl;
import com.example.demo.layer3.DebtorRepositoryImplementation;


@Service
public class DebtorServiceImplementation implements DebtorService{
	
	@Autowired
	DebtorRepositoryImplementation debtorRepo;

	@Autowired
	BasicRepositoryImpl base;
	
	@Override
	public List<Debtor> selectAllDebtors(){
		System.out.println("DebtorServiceImpl: Layer 4 ");
		return debtorRepo.selectAllDebtors();

	}

	@Override
	public Debtor selectDebtorByDebtorId(int debtorId) throws DebtorNotFoundException {
		System.out.println("DebtorServiceImpl: Layer 4 ");
		return debtorRepo.selectDebtorByDebtorId(debtorId);
	}

	@Override
	public void insertDebtorService(Debtor ref) {
		// TODO Auto-generated method stub

		Debtor db = new Debtor(ref.getDebtorFName(), ref.getDebtorMName(), ref.getDebtorLName(), ref.getDebtorAddress(),
				ref.getDebtorEmail(), ref.getDebtorPassword(), ref.getDebtorConfirmPass(), ref.getDebtorPhone(),
				ref.getDebtorDOB(), ref.getDebtorGender(), ref.getDebtorNationality(), ref.getDebtorAadhar(),
				ref.getDebtorPancard());// setter

		Loan ll = new Loan();

		Set<Loan> loans = ref.getLoanee();// getter
		LoanTracker lt = new LoanTracker();

		for (Loan loan : loans) {
			ll = loan;
			lt = ll.getLoanTrackers();
		}
		// Loan(int debtorSalary, int loanAmount, int interestRate, int tenure,Debtor
		// debtors1)
		Set<Loan> loans2 = new HashSet<Loan>();// setter
		Loan l2 = new Loan(ll.getDebtorSalary(), ll.getLoanAmount(), ll.getInterestRate(), ll.getTenure(), db);// setter
		// LoanTracker(Loan loaneees, String debtorPhone, String verificationStatus,
		// String finalApproval,
		// String remark, String accountNum, int balance)
		LoanTracker lt2 = new LoanTracker(l2, lt.getDebtorPhone(), lt.getVerificationStatus(), lt.getFinalApproval(),
				lt.getRemark(), lt.getAccountNum(), lt.getBalance());// setter
		l2.setLoanTrackers(lt2);// setter
		loans2.add(l2);// adding to set
		db.setLoanee(loans2);// setter

		Property p2 = new Property();
		Set<Property> propertys = ref.getPropertiess();// getter
		for (Property property : propertys) {
			p2 = property;
		}
		Set<Property> propertys2 = ref.getPropertiess();// setter
		propertys2.add(new Property(p2.getPropertyLocation(), p2.getPropertyName(), p2.getPropertyCost(), db));// adding
																												// to
																												// set
		db.setPropertiess(propertys2);// setter

		Employment e = ref.getEmployments();// getter
		Employment emp = new Employment(e.getEmploymentType(), e.getRetirementAge(), e.getOrganizationType(), db);
		db.setEmployments(emp);
		Docs d = ref.getDocs();
		Docs dd = new Docs(d.getUploadAadhar(), d.getUploadVoter(), d.getUploadPan(), d.getUploadSalaryslip(),
				d.getUploadLoa(), d.getUploadNoc(), d.getUploadSaleagreement(), db);
		db.setDocs(dd);
		base.saveRecord(db);
		System.out.println("Inserted successfully");
	}

	@Override
	public List<Debtor> selectAllDebtorsService() {
		// TODO Auto-generated method stub
		return debtorRepo.selectAllDebtors();
	}

	@Override
	public Debtor selectDebtorService(int id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Debtor> selectDebtorByDebtorIdService(int id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDebtorService(Debtor id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteDebtorService(int id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub

	}
	@Override
	public List<Debtor> selectDebtorByDebtorIdService(int id, String pass) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		return debtorRepo.selectDebtorByDebtorId(id, pass);
	}
	@Override
	public List<Debtor> selectDebtorByEmailService(String email, String pass) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		return debtorRepo.selectDebtorByEmail(email, pass);
	}
}