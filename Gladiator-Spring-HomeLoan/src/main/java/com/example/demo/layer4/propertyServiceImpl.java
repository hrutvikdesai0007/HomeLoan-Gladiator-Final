package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.Property;
import com.example.demo.layer2.PropertyNotFoundException;
@Service
public class propertyServiceImpl implements propertyService{

	@Override
	public List<Property> selectAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan selectLoanService(int id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> selectLoanByApplication_IdService(int Application_Id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatepropertServicey(Property id, int a) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletepropertyService(int id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
