package com.example.demo.layer5;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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
import com.example.demo.layer3.DebtorRepositoryImplementation;
import com.example.demo.layer3.EmploymentRepositoryImpl;
import com.example.demo.layer3.LoanRepositoryImplementation;
import com.example.demo.layer3.LoanTrackerRepositoryImplementation;
import com.example.demo.layer3.docsRepositoryImpl;
import com.example.demo.layer3.propertyReposoitoryImpl;
import com.example.demo.layer4.DebtorServiceImplementation;


@CrossOrigin
@RestController // it is a specialized version of @Component - arker to receive web request
@RequestMapping("/debtor")
public class DebtorJPAController {
	@Autowired
	DebtorRepositoryImplementation depRepo;

	@Autowired
	DebtorServiceImplementation depService;

	@Autowired
	DebtorRepositoryImplementation repo;

	@Autowired
	LoanRepositoryImplementation loanrepo;

	@Autowired
	EmploymentRepositoryImpl employrepo;

	@Autowired
	propertyReposoitoryImpl proprepo;

	@Autowired
	docsRepositoryImpl docrepo;

	@Autowired
	LoanTrackerRepositoryImplementation loantrackerrepo;

	public DebtorJPAController() {
		System.out.println("DebtorJPAController() created...");
	}

	@GetMapping
	@ResponseBody
	@RequestMapping(value = "/getdebt/{ino}")
	public Debtor getDebtor(@PathVariable int ino) {
		System.out.println("getdebt()...method ");
		try {
			return depRepo.selectDebtor(ino);
		} catch (DebtorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@GetMapping
	@ResponseBody
	@RequestMapping(path = "/getAlldebts")
	public List<Debtor> selectAllDebtorss() {
		System.out.println("selectAllDebtorss() ");
		return depRepo.selectAllDebtors();
	}

	@ResponseBody
	@DeleteMapping(path = "/deletedebt/{ino}")
	public void deleteEmployee(@PathVariable int ino) {
		System.out.println("deleteDebtor()...method");
		boolean deleted = false;
		String message = "Debtor not found";
		try {
			depRepo.deleteDebtor(ino);
			deleted = true;
			// message="Controller deleted the employee";
		} catch (DebtorNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			// message=e.getMessage();
		}
		if (deleted) {
			message = "Debtor deleted successfully";
			System.out.println("Controler not deleted" + message);
		}
	}
	@GetMapping
	@ResponseBody
	@RequestMapping(value = "/getdebt/{ino}/{password}")
	public List<Debtor> getDebtor(@PathVariable int ino, @PathVariable String password) {
		System.out.println("getdebt()...method ");
		try {
			return depRepo.selectDebtorByDebtorId(ino, password);
		} catch (DebtorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	} 
//	List<Income> incList = new ArrayList<Income>();
//	@PostMapping
//	@ResponseBody
//	@RequestMapping(value = "/addInc/{ploc}/{pname}/{cost}", method =  RequestMethod.POST)
//	public String addIncome( @PathVariable String ploc, @PathVariable String pname,@PathVariable int  cost) {
//		System.out.println("addIncome()...method ");
//		Income in = new Income(); // spring JPA - get the data from DB
//		in.setProperty_Location(ploc);
//		in.setProperty_Name(pname);
//		in.setCost_of_Property(cost);
//		incRepo.insertIncome(in);
//		return "Income Added Successfulyy";
//
//	}

	@ResponseBody
	@PostMapping(path = "/addDebtor/")
	public String addDebtor(@RequestBody Debtor in) throws LoanNotFoundException, EmploymentNotFoundException,
			PropertyNotFoundException, DocsNotFoundException, LoanTrackerNotFoundException {
		System.out.println("addinsertDebtor()...method ");
		// Income in = new Income(); // spring JPA - get the data from DB
		// in.setProperty_Location(ploc);
		// in.setProperty_Name(pname);
		/*
		 * Emp e = Repo.getEmp(100) Bank b = repo.getBank(200) Now e.setBank(b) And
		 * b.setEmp(e) Repo. Merge(b)
		 */

		// in.setCost_of_Property(cost);
		
//		Debtor db = new Debtor();
//		System.out.println(in.toString());
//		System.out.println(in.getDebtorId());
//		depService.insertDebtorService(in);
//		System.out.println(in.toString());
//		System.out.println(in.getDebtorId());
//		int a1 = in.getDebtorId();
//		Loan b1 = new Loan();
//		// in.setLoanee(b1);
//		System.out.println(in.getLoanee());
//		LoanTracker lt = new LoanTracker();
//		db.setLoanee(in.getLoanee());
//		Set<Loan> o = db.getLoanee();
//		for (Loan loan : o) {
//			System.out.println("inside for loop");
//			System.out.println(loan.getApplicationId());
//			int a = loan.getApplicationId();
//			b1 = loan;
//			b1.setDebtors1(in);
//			loanrepo.updateLoan(loan, a1);
//			System.out.println("loantracker here ");
//			System.out.println(a);
//			lt = b1.getLoanTrackers();
//			System.out.println(lt.getTrackerId());
//			loantrackerrepo.updateloanTracker(lt, a);
//			System.out.println(b1.toString());
//			System.out.println("loantracker here exited ");
//		}
//
//		Employment e = in.getEmployments();
//		employrepo.updateEmployment(e, a1);
//
//		Docs d = in.getDocs();
//		docrepo.updateDocs(d, a1);
//		Property p2 = new Property();
//		Set<Property> p1 = in.getPropertiess();
//		for (Property property : p1) {
//			System.out.println("inside for loop");
//			p2 = property;
//			;
//			proprepo.updateproperty(property, a1);
//		}
//
//		System.out.println("exiot for loop");
		depService.insertDebtorService(in);
		
		
		
		return "Debtor Added Successfulyy";

	}
}
