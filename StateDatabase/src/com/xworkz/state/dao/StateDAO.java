package com.xworkz.state.dao;

import com.xworkz.state.entity.StateEntity;

public interface StateDAO {
	
	public void create(StateEntity stateEntity);
	
	default StateEntity  getbyNameAndid(String name,int id) {
		return null;
		
	}
	
	
	default void updateById(String state,String capital,int id) {
		
	}
	default void deleteById(int id) {
		
	}
}
