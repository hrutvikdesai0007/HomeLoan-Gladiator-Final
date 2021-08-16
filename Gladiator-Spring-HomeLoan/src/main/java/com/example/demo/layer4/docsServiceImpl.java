package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.Debtor;
import com.example.demo.layer2.Docs;
import com.example.demo.layer2.DocsNotFoundException;
@Service
public class docsServiceImpl implements docsService {

	@Override
	public void insertDocsService(Docs ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Docs> selectAllDocsService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Debtor selectDocsService(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Docs> selectDocsByDocIdService(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDocsService(Docs id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDocsService(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
