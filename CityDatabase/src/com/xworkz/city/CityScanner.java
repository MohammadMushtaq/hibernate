package com.xworkz.city;

import com.xworkz.city.dao.CityDAO;
import com.xworkz.city.dao.CityImpl;
import com.xworkz.city.entity.CityEntity;

public class CityScanner {

	public static void main(String[] args) {
		CityEntity cityEntity = new CityEntity(1,"bangalore",226564d,"Wounderla","majestic");
		CityEntity cityEntity1 = new CityEntity(2,"hydrabad",32564664d,"charminar","golgunda");
		CityEntity cityEntity2 = new CityEntity(3,"bellary",122654d,"fort","devinagar");
		CityEntity cityEntity3 = new CityEntity(4,"hubli",426564d,"unkal ","deshpandenagar");
		CityEntity cityEntity4 = new CityEntity(5,"chennai",526564d,"chennaiTemple","daehd");
		
		
		CityDAO cityDAO = new CityImpl();
	//	cityDAO.create(cityEntity1);
   //   	cityDAO.create(cityEntity2);
   //   	cityDAO.create(cityEntity3);
   //   	cityDAO.create(cityEntity4);
 
	//	cityDAO.getById(2);
		
	//	cityDAO.updateById("dehradon", 5);
		cityDAO.deleteById(5);
	}
	

}
