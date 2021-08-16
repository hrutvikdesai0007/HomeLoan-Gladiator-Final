package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanNotFoundException;
import com.example.demo.layer2.Property;
import com.example.demo.layer2.PropertyNotFoundException;

//
public interface propertyReposoitory {
	void property(Property ref);

	List<Property> selectAllProperties();

	Property selectProperty(int id) throws PropertyNotFoundException;

	List<Property> selectLoanByApplication_Id(int Application_Id) throws PropertyNotFoundException;

	void updateproperty(Property id,int a) throws PropertyNotFoundException;

	void deleteproperty(int id) throws PropertyNotFoundException;
}
