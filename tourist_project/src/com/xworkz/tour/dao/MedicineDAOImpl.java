package com.xworkz.tour.dao;

import java.util.Iterator;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.transaction.Transaction;

import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.util.EntityUtil;

public class MedicineDAOImpl implements MedicineDAO {

	@Override
	public void save(MedicineEntity mediEntity) {
		EntityManagerFactory entityManagerFactory = EntityUtil.getEntityManagerFactory();
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(mediEntity);
		transaction.commit();

	}

	@Override
	public void saveAll(List<MedicineEntity> medicineEntities) {
		EntityManagerFactory entityManagerFactory = EntityUtil.getEntityManagerFactory();

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount =0;
			for (int i = 0; i < 10; i++) {
				
					for (MedicineEntity medicineEntity : medicineEntities) {
						
						manager.persist(medicineEntity);
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
