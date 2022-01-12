package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.BiscuitEntity;
import com.xworkz.tour.util.EntityUtil;

public class BiscuitDAOImpl implements BiscuitDAO{

	@Override
	public void save(BiscuitEntity biscuitEntity) {
		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(biscuitEntity);
		transaction.commit();
		
		
	}

}
