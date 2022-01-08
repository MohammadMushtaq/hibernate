package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyDAO {

	public void create(CompanyEntity companyEntity);
	
	default CompanyEntity getById(int id) {
		
		
		return null;
		
	}
default void updateById(String name,int id) {
		
	}
     default void deleteById(int id) {
		
	}
}
