package com.xworkz.country;

import com.xworkz.country.dao.CountryDAO;
import com.xworkz.country.dao.CountryImpl;
import com.xworkz.country.entity.CountryEntity;

public class CountryScanner {

	public static void main(String[] args) {

		CountryEntity countryEntity = new CountryEntity(1, "india", "asia", "130crore");
		CountryEntity countryEntity1 = new CountryEntity(2, "pakistan", "asia", "40crore");
		CountryEntity countryEntity2 = new CountryEntity(3, "usa", "southAmerica", "80crore");
		CountryEntity countryEntity3 = new CountryEntity(4, "china", "asia", "135crore");

		CountryDAO countryDAO = new CountryImpl();
	//	countryDAO.create(countryEntity1);
	//	countryDAO.create(countryEntity2);
	//	countryDAO.create(countryEntity3);

		
	//	countryDAO.getByName(1);
	//	countryDAO.updateById("140crore", 4);
		
		countryDAO.deleteById(2);
	}

}
