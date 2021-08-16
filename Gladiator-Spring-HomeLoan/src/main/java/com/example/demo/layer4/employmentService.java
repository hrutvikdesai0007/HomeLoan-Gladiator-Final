package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;
import com.example.demo.layer2.Employment;
import com.example.demo.layer2.EmploymentNotFoundException;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;
import com.example.demo.layer2.PropertyNotFoundException;

@Service
public interface employmentService {
	void insertEmploymentDetailService(Employment ref);
	List<Employment> selectAllEmploymentDetailsService();
	Employment selectEmploymentDetailService(int id) throws EmploymentNotFoundException;
	void updateEmploymentService(Employment id,int a) throws EmploymentNotFoundException;
	void deleteEmploymentService(int id) throws EmploymentNotFoundException;
}
