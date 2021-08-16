package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.AdminNotFoundException;
import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.Loan;

@Repository
public class AdminRepositoryImplementation extends BaseRepository implements AdminRepository{
	
	public AdminRepositoryImplementation() {
		System.out.println("AdminRepositoryImplementation() constructed...");
	}
	
	@Transactional
	public List<Admin> selectAllAdmins() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Admin");
		List<Admin> adminList= query.getResultList();
		return adminList;
	}

	@Transactional
	public List<Admin> selectAdminByUsername(String adminUsername, String adminPassword) throws AdminNotFoundException {
		System.out.println("Admin by username......");
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT ad from Admin ad WHERE ad.adminUsername=:adminUsername and ad.adminPassword=:adminPassword");
		query.setParameter("adminUsername", adminUsername);
		query.setParameter("adminPassword", adminPassword);
		List<Admin> adminList = query.getResultList();	
		return adminList;
	}
	
}
//select lt from LoanTracker lt where lt.trackerId=:trackerId and lt.debtorPhone=:debtorPhone