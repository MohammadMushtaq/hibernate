package com.xworkz.city.dao;

import com.xworkz.city.entity.CityEntity;

public interface CityDAO {

	void create(CityEntity cityEntity);
	
	default  CityEntity getById(int id) {
		
		return null;
		
	}
	default void updateById(String name,int id) {
		
	}
     default void deleteById(int id) {
		
	}
	
}
