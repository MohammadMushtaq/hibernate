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

}
