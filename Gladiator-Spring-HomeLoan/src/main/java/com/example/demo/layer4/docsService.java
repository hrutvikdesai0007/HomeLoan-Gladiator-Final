package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.DebtorNotFoundException;
import com.example.demo.layer2.Docs;
import com.example.demo.layer2.DocsNotFoundException;

@Service
public interface docsService {
	void insertDocsService(Docs ref);//(int std, String div, int roll);
	List<Docs> selectAllDocsService();
	Debtor selectDocsService(int id) throws DocsNotFoundException;
	List<Docs> selectDocsByDocIdService(int id)throws DocsNotFoundException ;
	void updateDocsService(Docs id) throws DocsNotFoundException;
	void deleteDocsService(int id) throws DocsNotFoundException;
	/*
	 * void insertDebtor(Debtor ref);
	List<Debtor> selectAllDebtors();
	Debtor selectDebtor(int id) throws DebtorNotFoundException;
	List<Debtor> selectDebtorByDebtorId(int id)throws DebtorNotFoundException ;
	void updateDebtor(Debtor id) throws DebtorNotFoundException;
	void deleteDebtor(int id) throws DebtorNotFoundException;
	 */
}
