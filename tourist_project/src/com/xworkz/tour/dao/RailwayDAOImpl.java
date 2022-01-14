package com.xworkz.tour.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

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

	@Override
	public void saveAll(List<RailwayEntity> saveEntity) {
		EntityManagerFactory entityManagerFactory = EntityUtil.getEntityManagerFactory();

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount =0;
			for (int i = 0; i < 10; i++) {
				
					for (RailwayEntity railwayEntity : saveEntity) {
						
						manager.persist(railwayEntity);
						manager.flush();
						if (flushcount == 10) {
						manager.clear();			
						flushcount++;
						
					}
				}
			}
		} catch (PersistenceException e) {

			transaction.rollback();
		}	
		transaction.commit();
		
	}

}
