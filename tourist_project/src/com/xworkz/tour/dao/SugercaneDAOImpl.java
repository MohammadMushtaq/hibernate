package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.SugercaneEntity;
import com.xworkz.tour.util.EntityUtil;

public class SugercaneDAOImpl implements SugercaneDAO{

	@Override
	public void save(SugercaneEntity sugercaneEntity) {
		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(sugercaneEntity);
		transaction.commit();
		
	}

}
