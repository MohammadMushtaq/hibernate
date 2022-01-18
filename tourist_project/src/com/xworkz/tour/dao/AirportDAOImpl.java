package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.AirportEntity;
import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.entity.WebSiteEntity;
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
			int flushcount=0;  
		
		for (AirportEntity airportEntity : saveAll) {
			
			manager.persist(airportEntity);
			
			if (flushcount >= 10) {	//1>>2>>3
				manager.flush();
				System.out.println("flushing the data");
				flushcount=0;
				
				manager.clear();
				System.out.println("clear the data");
				}
			flushcount++;
			}
		transaction.commit();
		}
			catch (PersistenceException e) {
			transaction.rollback();
			}
		
}
}