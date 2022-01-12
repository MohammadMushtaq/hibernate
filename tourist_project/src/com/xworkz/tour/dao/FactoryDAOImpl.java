package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.FactoryEntity;
import com.xworkz.tour.util.EntityUtil;

public class FactoryDAOImpl implements FactoryDAO{

	@Override
	public void save(FactoryEntity factoryEntity) {
		
		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(factoryEntity);
		transaction.commit();
	}
	
/*	public void  updateById(String name,String type,String location,String noOfEmployee,boolean active,int id) {

		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
	
}*/
}