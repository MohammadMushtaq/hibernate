package com.xworkz.patient;

import com.xworkz.patient.dao.PatientDAO;
import com.xworkz.patient.dao.Patientimpl;
import com.xworkz.patient.entity.PatientEntity;

public class patientScanner {

	public static void main(String[] args) {
		PatientEntity patientEntity = new PatientEntity(1,"naveen","bangalore","positive",25,145);
		PatientEntity patientEntity1 = new PatientEntity(2,"sunil","hydrabad","negitive",24,148);
		PatientEntity patientEntity2 = new PatientEntity(3,"naveen","bangalore","positive",20,155);
		PatientEntity patientEntity3 = new PatientEntity(4,"naveen","bangalore","positive",21,165);
		PatientEntity patientEntity4 = new PatientEntity(5,"naveen","bangalore","positive",24,175);
		
		PatientDAO patientDAO = new Patientimpl();
	//	patientDAO.create(patientEntity1);
	//	patientDAO.create(patientEntity2);
	//	patientDAO.create(patientEntity3);
	//	patientDAO.create(patientEntity4);
		
		patientDAO.getById(1);
		patientDAO.updateById("krish", 27, 5);
		
		patientDAO.deleteById(3);
		
	}

}
