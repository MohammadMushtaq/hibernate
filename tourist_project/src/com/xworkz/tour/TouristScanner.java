package com.xworkz.tour;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TouristScanner {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz.tourist");
		System.out.println(entityManagerFactory);

	}

}
