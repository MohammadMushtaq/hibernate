package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.RailwayEntity;
import com.xworkz.tour.util.EntityUtil;

public class RailwayDAOImpl implements RailwayStationDAO{

	@Override
	public void save(RailwayEntity railwayEntity) {
		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(railwayEntity);
		transaction.commit();
		
	}

}
