package com.example.demo.layer3;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanNotFoundException;
import com.example.demo.layer2.Loan;

@Repository
public class LoanRepositoryImplementation extends BaseRepository implements LoanRepository{

	@Transactional
	public void insertLoan(Loan ref) {
		// TODO Auto-generated method stub
		System.out.println("loan insertion called..." + ref);
		EntityManager entityManager = getEntityManager();
		entityManager.persist(ref);
		System.out.println("loan inserted..." + ref);
	}

	@Override
	public List<Loan> selectAllLoans() {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Loan");
		List<Loan> loanList = query.getResultList();
		return loanList;
	}

	@Override
	public Loan selectLoan(int id) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Loan.class, id);
	}

	@Override
	public List<Loan> selectLoanByApplication_Id(int Application_Id) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select e from Loan e where e.APPLICATIONID = :vAPPLICATIONID");
		query.setParameter("vAPPLICATIONID", Application_Id);
		List<Loan> loanListAsPerID = query.getResultList();
		return loanListAsPerID;
	}

	@Transactional
	public void updateLoan(Loan id,int a) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager1 = getEntityManager();
		Query query = entityManager1.createNativeQuery("UPDATE Loan set DEBTORID=:vDEBTORID where APPLICATIONID=:vAPPLICATIONID");
        query.setParameter("vDEBTORID", a);
        query.setParameter("vAPPLICATIONID" ,id.getApplicationId());
        query.executeUpdate();
	}

	@Override
	public void deleteLoan(int id) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		
	}
	

}
