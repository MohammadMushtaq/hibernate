package com.xworkz.company.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.company.entity.CompanyEntity;

public class CompanyImpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity companyEntity) {
		System.out.println(companyEntity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(CompanyEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(companyEntity);
		tr.commit();
		session.close();
		sessionFactory.close();
	}

	@Override
	public CompanyEntity getById(int id) {

		CompanyEntity companyEntity = null;
		System.out.println("invked getbyid");
		System.out.println("id passed as argument " + id);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			companyEntity = session.get(CompanyEntity.class, id);
			if (companyEntity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return companyEntity;
	}

	@Override
	public void updateById(String name, int id) {
		System.out.println("invode by id and update");

		System.out.println("passing arg " + name + " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(CompanyEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			CompanyEntity entity = session.get(CompanyEntity.class, id);
			if (entity != null) {

				entity.setName(name);
				session.update(entity);
				tran.commit();
				System.out.println("entity updated");
				session.close();

			} else {
				System.out.println("not found wrong passing");
			}
			factory.close();
		}
	}
	@Override
	public void deleteById(int id) {
		System.out.println("invoked delete by id");
		 
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory(); 		
		if(factory!=null) {
			Session session =factory.openSession();
			Transaction transaction=session.beginTransaction();
			CompanyEntity entity=session.get(CompanyEntity.class, id);
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
