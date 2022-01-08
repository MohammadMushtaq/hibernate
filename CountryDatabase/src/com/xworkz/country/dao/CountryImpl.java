package com.xworkz.country.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.country.entity.CountryEntity;


public class CountryImpl implements CountryDAO{

	@Override
	public void create(CountryEntity countryEntity) {
		System.out.println(countryEntity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CountryEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
	
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(countryEntity);
		tr.commit();
		session.close();
		sessionFactory.close();
	}
	@Override
	public CountryEntity getByName(int name) {
		CountryEntity countryentity = null;
		System.out.println("invked getbyid");
		System.out.println("id passed as argument " + name);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(CountryEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			countryentity = session.get(CountryEntity.class, name);
			if (countryentity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return countryentity;
	}
	@Override
	public void updateById(String population, int id) {
	
		System.out.println("invode by id and update");

		System.out.println("passing arg " + population + " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CountryEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			CountryEntity entity = session.get(CountryEntity.class, id);
			if (entity != null) {

				entity.setName(population);
				session.update(entity);
				tran.commit();
				System.out.println("entity updated");
				session.close();

			} else {
				System.out.println("not found wrong passing");
			}
			factory.close();

		}
		
	}@Override
	public void deleteById(int id) {
		
		System.out.println("invoked delete by id");
 
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory(); 		
		if(factory!=null) {
			Session session =factory.openSession();
			Transaction transaction=session.beginTransaction();
			CountryEntity entity=session.get(CountryEntity.class, id);
			if(entity!=null) {
				session.delete(entity);
				transaction.commit();
				System.out.println("you are genius found that and deleted");
				session.close();
			}else {
				System.out.println("not found that id");
			}
		}factory.close();
	}
	

}
