package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Admin;
import com.example.demo.layer2.AdminNotFoundException;
import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;


public interface AdminRepository {
	List<Admin> selectAllAdmins() ;
	List<Admin> selectAdminByUsername(String adminUsername, String adminPassword) throws AdminNotFoundException;
}
