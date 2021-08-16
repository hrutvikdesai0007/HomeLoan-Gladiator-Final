package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;
import com.example.demo.layer2.Loan;

@Repository
public class DebtorRepositoryImplementation extends BaseRepository implements DebtorRepository{
	
	@Transactional
	public void insertDebtor(Debtor ref) {
		// TODO Auto-generated method stub
		System.out.println("Debtor insertion called..." + ref);
		EntityManager entityManager = getEntityManager();
		entityManager.persist(ref);
		System.out.println("Debtor inserted..." + ref);
	}

	@Transactional
	public List<Debtor> selectAllDebtors() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Debtor");
		List<Debtor> debList= query.getResultList();
		return debList;
	}

	@Transactional
	public Debtor selectDebtorByDebtorId(int debtorId) throws DebtorNotFoundException {
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Debtor.class, debtorId);//based on PK
	}

	@Transactional
	public Debtor selectDebtor(int id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Debtor.class, id);
	}

	@Transactional
	public void updateDebtor(Debtor id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDebtor(int id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Debtor founddebtor = entityManager.find(Debtor.class, id);
			if(founddebtor!=null)
				entityManager.remove(founddebtor);
			else
				throw new DebtorNotFoundException("Debtor Not Found : "+id);
			System.out.println(" Entitymanager: entity removed ... ");
		
	}
	
	@Transactional
	public List<Debtor> selectDebtorByDebtorId(int id, String pass) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select e from Debtor e where e.debtorId = :vDEBTORID and e.debtorPassword=:vDEBTORPASSWORD");
		query.setParameter("vDEBTORID", id);
		query.setParameter("vDEBTORPASSWORD", pass);
		List<Debtor> incListAsPerJob = query.getResultList();
		System.out.println("leng : " + incListAsPerJob.size());
		return incListAsPerJob;
	}
	
	@Transactional
	public List<Debtor> selectDebtorByEmail(String email, String pass) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select e from Debtor e where e.debtorEmail = :vDEBTOREMAIL and e.debtorPassword=:vDEBTORPASSWORD");
		query.setParameter("vDEBTOREMAIL", email);
		query.setParameter("vDEBTORPASSWORD", pass);
		List<Debtor> debtor = query.getResultList();
		System.out.println("leng : " + debtor.size());
		return debtor;
	}
	
	

}
