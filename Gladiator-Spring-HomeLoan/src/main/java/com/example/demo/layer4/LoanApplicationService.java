package com.example.demo.layer4;

import java.util.List;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanNotFoundException;
import com.example.demo.layer2.Loan;

public interface LoanApplicationService {
	List<Loan> selectLoanApplicationByLoanId(int LoanId) throws LoanNotFoundException ;
	List<Loan> selectAllLoanApplications();
	void insertLoanService(Loan ref);
	List<Loan> selectAllLoans();
	Loan selectLoanService(int id) throws LoanNotFoundException;
	List<Loan> selectLoanByApplication_IdService(int Application_Id) throws LoanNotFoundException;
	void updateLoanService(Loan id,int a) throws LoanNotFoundException;
	void deleteLoanService(int id) throws LoanNotFoundException;
}
