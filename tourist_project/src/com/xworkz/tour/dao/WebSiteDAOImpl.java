package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.tour.entity.WebSiteEntity;
import com.xworkz.tour.util.EntityUtil;

public class WebSiteDAOImpl implements WebsiteDAO {

	@Override
	public void save(List<WebSiteEntity> webSiteEntity) {
		EntityManagerFactory entityManagerFactory = EntityUtil.getEntityManagerFactory();

		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			int flushcount = 0;
			for (WebSiteEntity railwayEntity : webSiteEntity) {
				manager.persist(railwayEntity);
				if (flushcount >= 10) { // 1>>2>>3
					manager.flush();
					System.out.println("flushing the data");
					flushcount = 0;
					manager.clear();
					System.out.println("clear the data");
				}
				flushcount++;
			}
			transaction.commit();
		} catch (PersistenceException e) {
			transaction.rollback();
		}
	}
	@Override
	public WebSiteEntity getByNameGoogle() {
		EntityManager entityManager = EntityUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByNameGoogle");
			Object result = query.getSingleResult();
			WebSiteEntity entity = (WebSiteEntity) result;
			System.out.println("result fetched for name");

			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public WebSiteEntity getByLikeUrl() {
		EntityManager entityManager = EntityUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getbyurl");
			Object result = query.getSingleResult();
			WebSiteEntity entity = (WebSiteEntity) result;
			System.out.println("result fetched for url");
			return entity;
		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public WebSiteEntity getMaxBySince() {
		EntityManager entityManager = EntityUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByMaxSince");
			Object result = query.getSingleResult();
			WebSiteEntity entity = (WebSiteEntity) result;
			System.out.println("result fetched for max");
			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	@Override
	public WebSiteEntity getMinBySince() {
		EntityManager entityManager = EntityUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getByMinSince");
			Object result = query.getSingleResult();
			WebSiteEntity entity = (WebSiteEntity) result;
			System.out.println("result fetched for min");
			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public WebSiteEntity getSecondMinSince() {
		EntityManager entityManager = EntityUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("getbySecondMinSince");
			Object result = query.getSingleResult();
			WebSiteEntity entity = (WebSiteEntity) result;
			System.out.println("result fetched for secound min");
			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public WebSiteEntity getSecondMaxBySince() {
		EntityManager entityManager = EntityUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = entityManager.createNamedQuery("getbySecondMaxSince");
			Object result = query.getSingleResult();
			WebSiteEntity entity = (WebSiteEntity) result;
			System.out.println("result fetched for secound max");
			return entity;

		} catch (PersistenceException e) {
			e.printStackTrace();
		}
		return null;
	}

}
