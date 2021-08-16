package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;
import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;
import com.example.demo.layer2.PropertyNotFoundException;

@Service
public interface propertyService {

	List<Property> selectAllLoans();

	Loan selectLoanService(int id) throws PropertyNotFoundException;

	List<Property> selectLoanByApplication_IdService(int Application_Id) throws PropertyNotFoundException;

	void updatepropertServicey(Property id,int a) throws PropertyNotFoundException;

	void deletepropertyService(int id) throws PropertyNotFoundException;
}
