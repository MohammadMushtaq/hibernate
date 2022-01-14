package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.util.EntityUtil;

public class MedicineDAOImpl implements MedicineDAO{

	@Override
	public void save(MedicineEntity mediEntity) {
		EntityManagerFactory entityManagerFactory= EntityUtil.getEntityManagerFactory();
		EntityManager manager= entityManagerFactory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		transaction.begin();
		manager.persist(mediEntity);
		transaction.commit();
		
		
	}

}
