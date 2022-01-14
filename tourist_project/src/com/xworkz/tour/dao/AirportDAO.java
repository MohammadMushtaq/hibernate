package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.AirportEntity;

public interface AirportDAO {
	
	void save (AirportEntity airportEntity);
	
	void saveAll(List<AirportEntity> saveAll);

}
