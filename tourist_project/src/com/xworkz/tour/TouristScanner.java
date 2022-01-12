package com.xworkz.tour;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import com.xworkz.tour.dao.TouristPlaceDAO;
import com.xworkz.tour.dao.TouristPlaceDAOImpl;
import com.xworkz.tour.entity.TouristPlaceEntity;

public class TouristScanner {

	public static void main(String[] args) {
		
		TouristPlaceEntity entity= new TouristPlaceEntity(1, "tajmahal", "agra", 1500d, "peta", "winter");
		TouristPlaceEntity entity1= new TouristPlaceEntity(2, "bangalore", "nandihills", 1120d, "dosa", "summer");
		TouristPlaceEntity entity2= new TouristPlaceEntity(3, "statue of unity", "gujrat", 1200d, "fafda", "ranny");
		TouristPlaceEntity entity3= new TouristPlaceEntity(4, "vidha sabha", "delhi", 1100d, "kajukatli", "winter");
		TouristPlaceEntity entity4= new TouristPlaceEntity(5, "karla", "temple", 1220d, "puttu", "spring");

			TouristPlaceDAO tour= new	TouristPlaceDAOImpl();
			
			tour.save(entity1);
			tour.save(entity2);
			tour.save(entity3);
			tour.save(entity4);
	}

}
