package com.xworkz.tour.dao;

import javax.persistence.EntityManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import org.hibernate.event.internal.EventUtil;

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

}
