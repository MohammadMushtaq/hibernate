package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.AirportEntity;
import com.xworkz.tour.entity.MedicineEntity;
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

	@Override
	public void saveAll(List<AirportEntity> saveAll) {
		
		EntityManagerFactory entityManagerFactory = EntityUtil.getEntityManagerFactory();

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount =0;
			for (int i = 0; i < 10; i++) {
				
					for (AirportEntity airportEntity : saveAll) {
						
						manager.persist(airportEntity);
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
