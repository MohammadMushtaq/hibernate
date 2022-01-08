package com.xworkz.country.dao;

import com.xworkz.country.entity.CountryEntity;

public interface CountryDAO {

	public void create(CountryEntity countryEntity);
	
	default CountryEntity getByName(int name) {
		return null;
		
	}
	default void updateById(String population, int id) {
		
	}     default void deleteById(int id) {
		
	}
	
}
