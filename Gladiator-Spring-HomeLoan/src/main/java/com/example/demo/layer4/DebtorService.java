package com.example.demo.layer4;

import java.util.List;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;

public interface DebtorService {
	List<Debtor> selectAllDebtors();
	Debtor selectDebtorByDebtorId(int debtorId) throws DebtorNotFoundException;
	void insertDebtorService(Debtor ref);//(int std, String div, int roll);
	List<Debtor> selectAllDebtorsService();
	Debtor selectDebtorService(int id) throws DebtorNotFoundException;
	List<Debtor> selectDebtorByDebtorIdService(int id)throws DebtorNotFoundException ;
	void updateDebtorService(Debtor id) throws DebtorNotFoundException;
	void deleteDebtorService(int id) throws DebtorNotFoundException;
	List<Debtor> selectDebtorByDebtorIdService(int id, String pass)throws DebtorNotFoundException ;
	List<Debtor> selectDebtorByEmailService(String email, String pass)throws DebtorNotFoundException ;
}