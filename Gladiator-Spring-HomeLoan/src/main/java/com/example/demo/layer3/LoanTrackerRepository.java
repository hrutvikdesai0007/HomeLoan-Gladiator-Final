package com.example.demo.layer3;

import java.sql.SQLException;
import java.util.List;
import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;

public interface LoanTrackerRepository {
	List<LoanTracker> selectAllLoanTrackers() ;
	LoanTracker selectLoanTrackerByLoanId(int LoanId) throws LoanTrackerNotFoundException;
	void updateLoanTrackerApprove(LoanTracker loanTracker) throws LoanTrackerNotFoundException, SQLException;
	void updateLoanTrackerReject(LoanTracker loanTracker) throws LoanTrackerNotFoundException;
	LoanTracker selectloanTracker(int id) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectloanTrackerByApplication_Id(int Application_Id) throws LoanTrackerNotFoundException;
	void updateloanTracker(LoanTracker id,int a) throws LoanTrackerNotFoundException;
	void deleteloanTracker(int id) throws LoanTrackerNotFoundException;
	void insertloanTracker(LoanTracker ref);
	List<LoanTracker> selectLoan(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException;
}
