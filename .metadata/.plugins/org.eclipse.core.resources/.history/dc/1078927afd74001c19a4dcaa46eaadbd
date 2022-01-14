package com.xworkz.tour;

import com.xworkz.tour.dao.RailwayDAOImpl;
import com.xworkz.tour.dao.RailwayStationDAO;
import com.xworkz.tour.entity.RailwayEntity;

public class RailwayScanner {

	public static void main(String[] args) {

		RailwayEntity railwayEntity1= new RailwayEntity(1,"bellary",4,"bellary","bangalore",45);
		RailwayEntity railwayEntity2= new RailwayEntity(2,"hampi",4,"hampi","vijayawada",55);
		RailwayEntity railwayEntity3= new RailwayEntity(3,"mysore",4,"mysore","amravati",150);
		RailwayEntity railwayEntity4= new RailwayEntity(4,"delhi",4,"agra","delhi",145);
		RailwayEntity railwayEntity5= new RailwayEntity(5,"manglore",4,"mangalore","kochi",45);

		RailwayStationDAO railwayStationDAO= new RailwayDAOImpl();
		railwayStationDAO.save(railwayEntity1);
		railwayStationDAO.save(railwayEntity2);
		railwayStationDAO.save(railwayEntity3);
		railwayStationDAO.save(railwayEntity4);
		railwayStationDAO.save(railwayEntity5);
	}

}
