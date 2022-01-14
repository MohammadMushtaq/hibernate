package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.AirportEntity;
import com.xworkz.tour.util.EntityUtil;

public class AirportDAOImpl implements AirportDAO{

	@Override
	public void save(AirportEntity airportEntity) {
		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(airportEntity);
		transaction.commit();
		
		
	}

	
}
