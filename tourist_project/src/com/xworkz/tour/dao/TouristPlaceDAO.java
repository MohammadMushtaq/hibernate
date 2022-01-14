package com.xworkz.tour.dao;



import java.util.List;

import com.xworkz.tour.entity.TouristPlaceEntity;

public interface TouristPlaceDAO {

	public void save(TouristPlaceEntity touristPlaceEntity);
	
	void saveAll(List<TouristPlaceEntity> SaveTour);
	
}
