package com.example.demo.layer3;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
@Repository
public class BasicRepositoryImpl extends BaseRepository{
	public EntityManager getEntityManager(){
		EntityManager entityManager = super.getEntityManager();
		return entityManager;
		}
		
		@Transactional
		public void saveRecord(Object o) {
			getEntityManager().persist(o);
		}
}
