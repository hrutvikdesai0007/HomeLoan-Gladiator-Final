package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Docs;
import com.example.demo.layer2.DocsNotFoundException;
import com.example.demo.layer2.Loan;

//
public interface docsReposoitory {
	void docs(Docs ref);

	List<Docs> selectAllDocs();

	Docs selectDocs(int id) throws DocsNotFoundException;

	List<Docs> selectDocsByDoc_Id(int docId) throws DocsNotFoundException;

	void updateDocs(Docs id,int a) throws DocsNotFoundException;

	void deleteDocs(int id) throws DocsNotFoundException;
}
