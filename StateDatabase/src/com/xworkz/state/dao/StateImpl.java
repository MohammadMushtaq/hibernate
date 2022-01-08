package com.xworkz.state.dao;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.state.entity.StateEntity;


public class StateImpl implements StateDAO {

	@Override
	public void create(StateEntity stateEntity) {

		System.out.println(stateEntity);
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(StateEntity.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
	
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(stateEntity);
		tr.commit();
		session.close();
		sessionFactory.close();
		}
	@Override
	public StateEntity getbyNameAndid(String name, int id) {
		StateEntity stateEntity = null;
		System.out.println("invked getbyid");
		System.out.println("id passed as argument "+name+ id);

		SessionFactory sessionfactory = new Configuration().configure().addAnnotatedClass(StateEntity.class)
				.buildSessionFactory();
		if (sessionfactory != null) {
			Session session = sessionfactory.openSession();
			stateEntity = session.get(StateEntity.class, id);
			if (stateEntity != null) {
				System.out.println("passing id is found");
			} else {
				System.out.println("id not found");
			}
		}
		return stateEntity;
	}
	@Override
	public void updateById(String state, String capital, int id) {
		System.out.println("invode by id and update");

		System.out.println("passing arg " + state +"capital"+ " " + id);

		SessionFactory factory = new Configuration().configure().addAnnotatedClass(StateEntity.class)
				.buildSessionFactory();
		if (factory != null) {

			Session session = factory.openSession();
			Transaction tran = session.beginTransaction();
			StateEntity entity = session.get(StateEntity.class, id);
			if (entity != null) {

				entity.setName(state);
				entity.setsCapital(capital);
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
		 
		SessionFactory factory= new Configuration().configure().addAnnotatedClass(StateEntity.class).buildSessionFactory(); 		
		if(factory!=null) {
			Session session =factory.openSession();
			Transaction transaction=session.beginTransaction();
			StateEntity entity=session.get(StateEntity.class, id);
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
