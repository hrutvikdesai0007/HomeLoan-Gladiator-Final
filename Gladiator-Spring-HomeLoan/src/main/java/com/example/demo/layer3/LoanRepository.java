package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanNotFoundException;


public interface LoanRepository{
	void insertLoan(Loan ref);

	List<Loan> selectAllLoans();

	Loan selectLoan(int id) throws LoanNotFoundException;

	List<Loan> selectLoanByApplication_Id(int Application_Id) throws LoanNotFoundException;

	void updateLoan(Loan id,int a) throws LoanNotFoundException;

	void deleteLoan(int id) throws LoanNotFoundException;}
