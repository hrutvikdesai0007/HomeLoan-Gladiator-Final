package com.example.demo.layer4;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;


public interface LoanTrackerService {
	LoanTracker selectLoanTrackerByLoanId(int LoanId) throws LoanTrackerNotFoundException ;
	List<LoanTracker> selectAllLoanTrackers();
	void updateLoanTrackerApprove(LoanTracker loanTracker) throws LoanTrackerNotFoundException, SQLException;
	void updateLoanTrackerReject(LoanTracker loanTracker) throws LoanTrackerNotFoundException;
	void insertloanTrackerService(LoanTracker ref);
	List<LoanTracker> selectAllLoansService();
	Loan selectloanTrackerService(int id) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectloanTrackerByApplication_IdService(int Application_Id) throws LoanTrackerNotFoundException;
	void updateloanTrackerService(LoanTracker id,int a) throws LoanTrackerNotFoundException;
	void deleteloanTrackerService(int id) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectLoanService(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException;
}
