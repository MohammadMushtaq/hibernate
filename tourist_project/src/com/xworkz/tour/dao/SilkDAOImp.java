package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.SilkManufactureEntity;
import com.xworkz.tour.util.EntityUtil;

public class SilkDAOImp implements SilkDAO{

	@Override
	public void save(SilkManufactureEntity silkManufactureEntity) {
		
		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(silkManufactureEntity);
		transaction.commit();
	}

}
