package com.xworkz.tour.dao;

import java.util.List;


import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.AirportEntity;
import com.xworkz.tour.entity.TouristPlaceEntity;
import com.xworkz.tour.util.EntityUtil; 

public class TouristPlaceDAOImpl implements TouristPlaceDAO{

	@Override
	public void save(TouristPlaceEntity touristPlaceEntity) {
		
		EntityManagerFactory emf= EntityUtil.getEntityManagerFactory();
		//emf will check the persistence.xml
		//convert to dom
		//load the file check syntex
		//info of user pass;
		//emf impl hibernate
		//store to memory
		
		EntityManager manager= emf.createEntityManager();
		//entity manger imp from connevtion pool
		//perform crud 
		
		EntityTransaction tran=  manager.getTransaction();
		
		tran.begin();
		

		manager.persist(touristPlaceEntity);
		
		tran.commit();
		
	}

	@Override
	public void saveAll(List<TouristPlaceEntity> SaveTour) {
		EntityManagerFactory entityManagerFactory = EntityUtil.getEntityManagerFactory();

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount=0;  
		
		for (TouristPlaceEntity touristPlaceEntity : SaveTour) {
			
			manager.persist(touristPlaceEntity);
			
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
