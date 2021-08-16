package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Employment;
import com.example.demo.layer2.EmploymentNotFoundException;

public interface EmploymentRepository {
	void insertEmploymentDetail(Employment ref);
	List<Employment> selectAllEmploymentDetails();
	Employment selectEmploymentDetail(int id) throws EmploymentNotFoundException;
	void updateEmployment(Employment id,int a) throws EmploymentNotFoundException;
	void deleteEmployment(int id) throws EmploymentNotFoundException;

}
