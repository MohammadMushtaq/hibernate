package com.xworkz.company;

import com.xworkz.company.dao.CompanyDAO;
import com.xworkz.company.dao.CompanyImpl;
import com.xworkz.company.entity.CompanyEntity;

public class CompanyScanner {

	public static void main(String[] args) {
//		CompanyEntity companyEntity1 = new CompanyEntity(1, "google", "mnc", "software", "www.google.com");
		//	CompanyEntity companyEntity2 = new CompanyEntity(2, "amazone", "mnc", "software", "www.amazone.com");
			CompanyEntity companyEntity3 = new CompanyEntity(3, "microsoft", "mnc", "software", "www.microsoft.com");
			CompanyEntity companyEntity4 = new CompanyEntity(4, "flipkart", "e-commerece", "service", "www.flipkart.com");

			CompanyDAO companyDAO = new CompanyImpl();
		//	companyDAO.create(companyEntity3);
		//	companyDAO.create(companyEntity4);
	//	companyDAO.getById(1)	;
		companyDAO.updateById("tata", 4);
		
	//	companyDAO.deleteById(1);
			
	}

}
