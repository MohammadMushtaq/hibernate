package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.RailwayEntity;

public interface RailwayStationDAO {
	
	public void save(RailwayEntity railwayEntity);
	
	void saveAll(List<RailwayEntity> saveEntity);

}
