package com.example.demo;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.dialect.identity.DB2390IdentityColumnSupport;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.Docs;
import com.example.demo.layer2.Employment;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.Property;
import com.example.demo.layer3.BaseRepository;
import com.example.demo.layer3.DebtorRepositoryImplementation;
import com.example.demo.layer3.EmploymentRepositoryImpl;
import com.example.demo.layer3.LoanRepositoryImplementation;
import com.example.demo.layer3.LoanTrackerRepositoryImplementation;
import com.example.demo.layer3.docsRepositoryImpl;
import com.example.demo.layer3.propertyReposoitoryImpl;

@SpringBootTest
public class PrimarykeyForeignKeyTestCases {
	@Autowired
	DebtorRepositoryImplementation debtorrRepo;
	
	@Autowired
	docsRepositoryImpl docRepo;
	
	@Autowired
	EmploymentRepositoryImpl empRepo;

	@Autowired
	LoanRepositoryImplementation loanRepo;

	@Autowired
	LoanTrackerRepositoryImplementation loanTrackerRepo;
	
	@Autowired
	propertyReposoitoryImpl propertyRepo;
	
	@Autowired
	BaseRepositoryImpl base;
	@Test//test 19
	void insertEverythingIntoDebtor() {
		String str="2015-03-31";
		Date date=Date.valueOf(str);
		//Debtor(int debtorId,String debtorFName, String debtorMName, String debtorLName, String debtorAddress, String debtorEmail,
		//String debtorPassword, String debtorConfirmPass, String debtorPhone, Date debtorDOB, String debtorGender,
		//String debtorNationality, String debtorAadhar, String debtorPancard)
		Debtor db=new Debtor(10, "DVD", "DVD", "DVD", "uran", "d@d.com", "123", "123", "1234", date, "M", "Indian", "123123123", "EEEWWW123");
		Set<Loan> loans=new HashSet<Loan>();
		//Loan(int applicationId, int debtorSalary, int loanAmount, int interestRate, int tenure, Debtor debtors1)
		Loan ll=new Loan(20, 100, 10000, 8, 9, db);
		//LoanTracker(int trackerId, Loan loaneees, String debtorPhone, String verificationStatus,
		//String finalApproval, String remark, String accountNum, int balance) 
		LoanTracker lt=new LoanTracker(30, ll, "1234", "Pending", "Rejected", "remarked", "123", 10);
		ll.setLoanTrackers(lt);
		loans.add(ll);

		db.setLoanee(loans);
		Set<Property> propertys=new HashSet<Property>();
		//Property(int propertyId, String propertyLocation, String propertyName, int propertyCost, Debtor debtors2)
		propertys.add(new Property(40, "Mumbai", "Rowhouse", 2400, db));
		db.setPropertiess(propertys);
		//Employment(int employmentId, String employmentType, int retirementAge, String organizationType,
		//Debtor debtors3)
		Employment emp=new Employment(50, "Salaried", 40, "Private", db);
		db.setEmployments(emp);
		//Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
		//String uploadLoa, String uploadNoc, String uploadSaleagreement, Debtor debtors)
		Docs dd=new Docs(60, "asdsadssa", "asdzcxzxc", null, null, null, null, null, db);
		db.setDocs(dd);
		base.saveRecord(db);
	}
	/*
	 * Employee emp = new Employee(101,"jack",5000);//parent
		
		Set<BankDetail> banks = new HashSet<BankDetail>();//child
		
		banks.add(new BankDetail(1030,1,"ICICI",3000,emp)); //<---watch emp is set here as FK
		banks.add(new BankDetail(1031,2,"SBI",3300,emp)); // emp as fk
		banks.add(new BankDetail(1032,3,"HDFC",3330,emp)); //emp as fk
		
		emp.setBankDetails(banks); // all bank details are set to emp
		base.saveRecord(emp); //emp is saved... hence all the nested bank is also set in db

	 * 
	 */
}
