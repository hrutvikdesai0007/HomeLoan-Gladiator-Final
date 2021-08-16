package com.example.demo.layer4;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;
import com.example.demo.layer3.LoanTrackerRepositoryImplementation;

@Service
public class LoanTrackerServiceImplementation implements LoanTrackerService{
	@Autowired
	LoanTrackerRepositoryImplementation loanTrackerRepo;
	@Override
	public LoanTracker selectLoanTrackerByLoanId(int LoanId) throws LoanTrackerNotFoundException {
		System.out.println("LoanTrackerServiceImpl: Layer 4 ");
		return loanTrackerRepo.selectLoanTrackerByLoanId(LoanId);
	}

	@Override
	public List<LoanTracker> selectAllLoanTrackers() {
		System.out.println("LoanTrackerServiceImpl: Layer 4 ");
		return loanTrackerRepo.selectAllLoanTrackers();
	}

	@Override
	public void updateLoanTrackerApprove(LoanTracker loanTracker) throws LoanTrackerNotFoundException, SQLException {
		loanTrackerRepo.updateLoanTrackerApprove(loanTracker);
	}
	@Override
	public void updateLoanTrackerReject(LoanTracker loanTracker) throws LoanTrackerNotFoundException {
		loanTrackerRepo.updateLoanTrackerReject(loanTracker);
	}

	
	@Override
	public void insertloanTrackerService(LoanTracker ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LoanTracker> selectAllLoansService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan selectloanTrackerService(int id) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LoanTracker> selectloanTrackerByApplication_IdService(int Application_Id)
			throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateloanTrackerService(LoanTracker id, int a) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteloanTrackerService(int id) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		
	}
	public List<LoanTracker> selectLoanService(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		return loanTrackerRepo.selectLoan(trackerId, debtorPhone);
	}

}
