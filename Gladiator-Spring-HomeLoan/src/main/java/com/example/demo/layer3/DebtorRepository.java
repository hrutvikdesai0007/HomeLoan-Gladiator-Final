package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;

public interface DebtorRepository {
	List<Debtor> selectAllDebtors() ;
	Debtor selectDebtorByDebtorId(int debtorId) throws DebtorNotFoundException;
	void updateDebtor(Debtor id) throws DebtorNotFoundException;
	void deleteDebtor(int id) throws DebtorNotFoundException;
	Debtor selectDebtor(int id) throws DebtorNotFoundException;
	void insertDebtor(Debtor ref);
	 List<Debtor> selectDebtorByDebtorId(int id, String pass)throws DebtorNotFoundException ;
	 List<Debtor> selectDebtorByEmail(String email, String pass)throws DebtorNotFoundException ;
}
