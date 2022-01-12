package com.xworkz.tour;

import com.xworkz.tour.dao.SilkDAO;
import com.xworkz.tour.dao.SilkDAOImp;
import com.xworkz.tour.entity.SilkManufactureEntity;

public class SilkScanner {

	public static void main(String[] args) {
		
		SilkManufactureEntity silkManufactureEntity = 
			new SilkManufactureEntity(1,"abc","bangalore","silk",250,5500000d,"15");
		SilkManufactureEntity silkManufactureEntity1 = 
				new SilkManufactureEntity(2,"abcd","hydrabad","jute",500,8600000d,"11");
		SilkManufactureEntity silkManufactureEntity2 = 
				new SilkManufactureEntity(3,"abc","bangalore","silk",250,6500000d,"12");
		SilkManufactureEntity silkManufactureEntity3 = 
				new SilkManufactureEntity(4,"abc","bangalore","silk",250,2700000d,"5");
		SilkManufactureEntity silkManufactureEntity4 = 
				new SilkManufactureEntity(5,"abc","bangalore","silk",250,1400000d,"25");
		SilkDAO silkDAO= new SilkDAOImp();
		silkDAO.save(silkManufactureEntity1);
		silkDAO.save(silkManufactureEntity2);
		silkDAO.save(silkManufactureEntity3);
		silkDAO.save(silkManufactureEntity4);
	//	silkDAO.save(silkManufactureEntity5);


		
		

	}

}
