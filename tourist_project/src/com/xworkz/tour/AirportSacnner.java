package com.xworkz.tour;

import com.xworkz.tour.dao.AirportDAO;
import com.xworkz.tour.dao.AirportDAOImpl;
import com.xworkz.tour.entity.AirportEntity;

public class AirportSacnner {

	public static void main(String[] args) {
		AirportEntity airportEntity1= new AirportEntity(1,"chatrapati","international","mumbai",
				"mumbai","usa",true);
		AirportEntity airportEntity2= new AirportEntity(2,"kerla","international","kochi",
				"kochi","dubai",true);
		
		AirportEntity airportEntity3= new AirportEntity(3,"ravigandi","international","hydrabad",
				"banglaore","hydrabad",true);
		
		AirportEntity airportEntity4= new AirportEntity(4,"kempegouda","international","bangalore",
				"bangalore","cannada",true);
		
		AirportEntity airportEntity5= new AirportEntity(5,"chennai","international","chennai",
				"kanyakumari","bangalore",true);
		
		
		AirportDAO dao= new AirportDAOImpl();
		dao.save(airportEntity1);
		dao.save(airportEntity2);
		dao.save(airportEntity3);
		dao.save(airportEntity4);
		dao.save(airportEntity5);

	}

}
