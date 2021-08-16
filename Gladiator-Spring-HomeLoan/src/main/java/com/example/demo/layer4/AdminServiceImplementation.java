package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.AdminNotFoundException;
import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;
import com.example.demo.layer3.AdminRepositoryImplementation;

@Service
public class AdminServiceImplementation implements AdminService{
	
	@Autowired
	AdminRepositoryImplementation adminRepo;

	@Override
	public List<Admin> selectAllAdmins() {
		System.out.println("AdminServiceImpl: Layer 4 ");
		return adminRepo.selectAllAdmins();
	}

	@Override
	public List<Admin> selectAdminByUsername(String adminUsername, String adminPassword) throws AdminNotFoundException {
		System.out.println("AdminServiceImpl: Layer 4 ");
		return adminRepo.selectAdminByUsername(adminUsername,adminPassword);
	}
}
