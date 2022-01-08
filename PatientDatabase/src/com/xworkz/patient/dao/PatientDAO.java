package com.xworkz.patient.dao;

import com.xworkz.patient.entity.PatientEntity;

public interface PatientDAO {
	
	void create (PatientEntity patientEntity);
	
	default PatientEntity getById(int id) {
		return null;}
	
	
	
	default void updateById (String p_Name,float p_age,int id) {
		
		
	}
	default void deleteById(int id) {}
}
