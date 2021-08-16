package com.example.demo;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.AdminNotFoundException;
import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;
import com.example.demo.layer2.Docs;
import com.example.demo.layer2.DocsNotFoundException;
import com.example.demo.layer2.Employment;
import com.example.demo.layer2.EmploymentNotFoundException;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanNotFoundException;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;
import com.example.demo.layer2.Property;
import com.example.demo.layer2.PropertyNotFoundException;
import com.example.demo.layer3.AdminRepository;
import com.example.demo.layer3.DebtorRepository;
import com.example.demo.layer3.DebtorRepositoryImplementation;
import com.example.demo.layer3.EmploymentRepositoryImpl;
import com.example.demo.layer3.LoanRepositoryImplementation;
import com.example.demo.layer3.LoanTrackerRepository;
import com.example.demo.layer3.LoanTrackerRepositoryImplementation;
import com.example.demo.layer3.docsRepositoryImpl;
import com.example.demo.layer3.propertyReposoitoryImpl;

@SpringBootTest
class HomeLoanApplicationTests {
	
	@Autowired
	LoanTrackerRepository loanrep;
	@Autowired
	DebtorRepository debtor;
	@Autowired
	AdminRepository admin;
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
	
	
	@Test//test 1
	void selectAllDebtorTest() {
		System.out.println("Loading all the debtors...");
		List<Debtor> debtorList = debtorrRepo.selectAllDebtors();
		System.out.println("debtorList "+debtorList.size());
		for (Debtor debtor : debtorList) {
			System.out.println("debtor : "+debtor);
		}
	}
	
	@Test//test 2
	void loadOneDebtorTest() throws DebtorNotFoundException {
		System.out.println("Loading a debtor...");
		Debtor dbtr = debtorrRepo.selectDebtor(594);
		System.out.println("Debtor"+dbtr);
	}
	
	@Test//test 3
	void selectAllDocsTest() {
		System.out.println("Loading all the docs...");
		List<Docs> docList = docRepo.selectAllDocs();
		System.out.println("docList "+docList.size());
		for (Docs doc : docList) {
			System.out.println("doc : "+doc);
			System.out.println("doc id: "+doc.getDocId());
			System.out.println("doc aadhar: "+doc.getUploadAadhar());
			System.out.println("doc loa: "+doc.getUploadLoa());
			System.out.println("doc noc: "+doc.getUploadNoc());
			System.out.println("doc pan: "+doc.getUploadPan());
			System.out.println("doc salaryslip: "+doc.getUploadSalaryslip());
			System.out.println("doc saleagreement: "+doc.getUploadSaleagreement());
			System.out.println("doc voter: "+doc.getUploadVoter());
		}
	}
	
	@Test//test 4
	void loadOneDocTest() throws DocsNotFoundException {
		System.out.println("Loading a doc...");
		Docs doc = docRepo.selectDocs(598);
		System.out.println("Doc"+doc);
		System.out.println("doc id: "+doc.getDocId());
		System.out.println("doc aadhar: "+doc.getUploadAadhar());
		System.out.println("doc loa: "+doc.getUploadLoa());
		System.out.println("doc noc: "+doc.getUploadNoc());
		System.out.println("doc pan: "+doc.getUploadPan());
		System.out.println("doc salaryslip: "+doc.getUploadSalaryslip());
		System.out.println("doc saleagreement: "+doc.getUploadSaleagreement());
		System.out.println("doc voter: "+doc.getUploadVoter());
	
	}
	@Test//test  5
	void selectAllEmploymentTest() {
		System.out.println("Loading all the Employment...");
		List<Employment> empList = empRepo.selectAllEmploymentDetails();
		System.out.println("debtorList "+empList.size());
		for (Employment emp : empList) {
			System.out.println("Employment : "+emp);
			System.out.println("Employment ID : "+emp.getEmploymentId());
			System.out.println("Employment Type: "+emp.getEmploymentType());
			System.out.println("Employment Org type: "+emp.getOrganizationType());
			System.out.println("Employment Retirement age: "+emp.getRetirementAge());
		}
	}
	
	@Test//test 6
	void loadOneEmploymentTest() throws EmploymentNotFoundException {
		System.out.println("Loading a Employment...");
		Employment emp = empRepo.selectEmploymentDetail(599);
		System.out.println("Employment : "+emp);
		System.out.println("Employment Debtor ID: "+emp.getDebtors3().getDebtorId());
		System.out.println("Employment ID : "+emp.getEmploymentId());
		System.out.println("Employment Type: "+emp.getEmploymentType());
		System.out.println("Employment Org type: "+emp.getOrganizationType());
		System.out.println("Employment Retirement age: "+emp.getRetirementAge());
	
	}
	
	@Test//test 7
	void selectAllLoanTest() {
		System.out.println("Loading all the loan...");
		List<Loan> loanList = loanRepo.selectAllLoans();
		System.out.println("loanList "+loanList.size());
		for (Loan loan : loanList) {
			System.out.println("loan : "+loan);
			System.out.println("loan debtor id : "+loan.getDebtors1().getDebtorId());
			System.out.println("loan application id: "+loan.getApplicationId());
			System.out.println("loan salary: "+loan.getDebtorSalary());
			System.out.println("loan interest: "+loan.getInterestRate());
			System.out.println("loan amount: "+loan.getLoanAmount());
			System.out.println("loan tenure: "+loan.getTenure());
		}
	}
	
	@Test//test 8
	void loadOneLoanTest() throws LoanNotFoundException  {
		System.out.println("Loading a loan...");
		Loan loan = loanRepo.selectLoan(596);
		System.out.println("loan : "+loan);
		System.out.println("loan debtor id : "+loan.getDebtors1().getDebtorId());
		System.out.println("loan application id: "+loan.getApplicationId());
		System.out.println("loan salary: "+loan.getDebtorSalary());
		System.out.println("loan interest: "+loan.getInterestRate());
		System.out.println("loan amount: "+loan.getLoanAmount());
		System.out.println("loan tenure: "+loan.getTenure());

	}
	
	@Test//test 9
	void selectAllLoanTrackers() {
		System.out.println("Loading all the loantrackers...");
		List<LoanTracker> loantrackList = loanTrackerRepo.selectAllLoanTrackers();
		System.out.println("debtorList "+loantrackList.size());
		for (LoanTracker loantrack : loantrackList) {
			System.out.println("loantracker : "+loantrack);
			System.out.println("loantracker AccountNum: "+loantrack.getAccountNum());
			System.out.println("loantracker Balance: "+loantrack.getBalance());
			System.out.println("loantracker DebtorPhone: "+loantrack.getDebtorPhone());
			System.out.println("loantracker FinalApproval: "+loantrack.getFinalApproval());
			System.out.println("loantracker Remark: "+loantrack.getRemark());
			System.out.println("loantracker TrackerId: "+loantrack.getTrackerId());
			System.out.println("loantracker VerificationStatus: "+loantrack.getVerificationStatus());
			System.out.println("loantracker Application id: "+loantrack.getLoaneees().getApplicationId());
			
		}
	}
	
	@Test//test 10
	void selectloanTracker() throws LoanTrackerNotFoundException  {
		System.out.println("Loading a loantracker...");
		LoanTracker loantrack = loanTrackerRepo.selectloanTracker(597);
		System.out.println("loantracker : "+loantrack);
		System.out.println("loantracker AccountNum: "+loantrack.getAccountNum());
		System.out.println("loantracker Balance: "+loantrack.getBalance());
		System.out.println("loantracker DebtorPhone: "+loantrack.getDebtorPhone());
		System.out.println("loantracker FinalApproval: "+loantrack.getFinalApproval());
		System.out.println("loantracker Remark: "+loantrack.getRemark());
		System.out.println("loantracker TrackerId: "+loantrack.getTrackerId());
		System.out.println("loantracker VerificationStatus: "+loantrack.getVerificationStatus());
		System.out.println("loantracker Application id: "+loantrack.getLoaneees().getApplicationId());
		
	}
	
	@Test//test 11
	void selectAllPropertyTest() throws PropertyNotFoundException{
		System.out.println("Loading all the Properties...");
		List<Property> propList = propertyRepo.selectAllProperties();
		System.out.println("debtorList "+propList.size());
		for (Property property : propList) {
			System.out.println("Property : "+property);
			System.out.println("Property debtor id : "+property.getDebtors2().getDebtorId());
			System.out.println("Property Cost: "+property.getPropertyCost());
			System.out.println("Property ID: "+property.getPropertyId());
			System.out.println("Property Location: "+property.getPropertyLocation());
			System.out.println("Property Name: "+property.getPropertyName());
			
		}
	}
	
	@Test//test 12
	void loadOnePropertyTest() throws PropertyNotFoundException {
		System.out.println("Loading a Property...");
		Property property = propertyRepo.selectProperty(40);
		System.out.println("Property : "+property);
		System.out.println("Property debtor id : "+property.getDebtors2().getDebtorId());
		System.out.println("Property Cost: "+property.getPropertyCost());
		System.out.println("Property ID: "+property.getPropertyId());
		System.out.println("Property Location: "+property.getPropertyLocation());
		System.out.println("Property Name: "+property.getPropertyName());	
	}
	
	@Test//test 13
	void updateDocsTest() throws DocsNotFoundException {
		//Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
		//String uploadLoa, String uploadNoc, String uploadSaleagreement)
		Docs d=new Docs(60, "asdsadssa", "asdzcxzxc", null, null, null, null, null);
		System.out.println("Starting update...");
		docRepo.updateDocs(d,10);
		System.out.println("Successfully updated");	
	}
	@Test//test 14
	void updateEmploymentTest() throws EmploymentNotFoundException {
		//Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
		//String uploadLoa, String uploadNoc, String uploadSaleagreement)
		Employment emp=new Employment(50, "Salaried", 40, "Private");
		System.out.println("Starting update...");
		empRepo.updateEmployment(emp, 10);
		System.out.println("Successfully updated");	
	}
	
	@Test//test 15
	void updateLoanTest() throws LoanNotFoundException {
		//Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
		//String uploadLoa, String uploadNoc, String uploadSaleagreement)
		Loan ll=new Loan(20, 100, 10000, 8, 9);
		System.out.println("Starting update...");
		loanRepo.updateLoan(ll, 10);
		System.out.println("Successfully updated");	
	}
	@Test//test 16
	void updateloanTracker() throws LoanTrackerNotFoundException {
		//Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
		//String uploadLoa, String uploadNoc, String uploadSaleagreement)
		LoanTracker lt=new LoanTracker(30, "1234", "Pending", "Rejected", "remarked", "123", 10);
		System.out.println("Starting update...");
		loanTrackerRepo.updateloanTracker(lt, 20);
		System.out.println("Successfully updated");	
	}
	@Test//test 17
	void updatePropertyTest() throws PropertyNotFoundException {
		//Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
		//String uploadLoa, String uploadNoc, String uploadSaleagreement)
		Property p =new Property(40, "Mumbai", "Rowhouse", 2400);
		System.out.println("Starting update...");
		propertyRepo.updateproperty(p, 10);
		System.out.println("Successfully updated");	
	}
		
	@Test//test 20
	void debtorinsertTest() {
	}
	
	@Test//test 21
	void test1updateLoanStatus() throws SQLException {
		System.out.println("-----------------------------------------");
		System.out.println("UPDATING THE LOAN STATUS OF A DEBTOR");
		System.out.println("Updating Debtor 1........");
		try {
			Debtor d = debtor.selectDebtorByDebtorId(1);
			Set<Loan> la = d.getLoanee();
			for (Loan loanApplication : la) {
				System.out.println(loanApplication.getApplicationId());
				LoanTracker lt = loanApplication.getLoanTrackers();
					lt.setVerificationStatus("Approved");
					System.out.println(lt.getVerificationStatus());
					try {
						loanrep.updateLoanTrackerApprove(lt);
					} catch (LoanTrackerNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		} catch (DebtorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-----------------------------------------");
	}
	
	@Test//test 22
	void test2selectAllDebtors() {
		List<Debtor> deb = debtor.selectAllDebtors();
		System.out.println("-----------------------------------------");
		System.out.println("SELECT ALL DEBTORS TEST CASE");
		System.out.println("Printing all Debtors........");
		for(int i = 0 ; i < deb.size() ; i++) {
			System.out.println(deb.get(i).getDebtorFName());
		}
		System.out.println("-----------------------------------------");
	}
	
	@Test//test 23
	void test3selectAllAdmins() {
		List<Admin> ad  = admin.selectAllAdmins();
		System.out.println("-----------------------------------------");
		System.out.println("SELECT ALL ADMINS TEST CASE");
		System.out.println("Printing all Admins........");
		for(int i = 0 ; i < ad.size() ; i++) {
			System.out.println(ad.get(i).getAdminFirstname());
		}
		System.out.println("-----------------------------------------");
	}
	
	@Test//test 24
	void test4selectAdminByUsernameAndPassword() throws AdminNotFoundException {
		List<Admin> ad = admin.selectAdminByUsername("AAA","BBB");
		System.out.println("-----------------------------------------");
		System.out.println("SELECT ADMIN BY USERNAME AND PASSWORD TEST CASE");
		System.out.println("Printing the Admin........");
		System.out.println(ad.get(0).getAdminFirstname());
		System.out.println(ad.get(0).getAdminLastName());
		System.out.println(ad.get(0).getAdminUsername());
		System.out.println(ad.get(0).getAdminPassword());
		System.out.println("-----------------------------------------");
	}
	
	
}
