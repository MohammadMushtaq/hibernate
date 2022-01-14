package com.xworkz.tour;

import com.xworkz.tour.dao.FactoryDAOImpl;
import com.xworkz.tour.entity.FactoryEntity;

public class FactoryScanner {

	public static void main(String[] args) {

		FactoryEntity factoryEntity= new FactoryEntity(1,"tata","car manufacture","mumbai",4500,true);
		FactoryEntity factoryEntity1= new FactoryEntity(2,"malya","flights","mumbai",400,false);
		FactoryEntity factoryEntity2= new FactoryEntity(3,"birla","cement manufacture","gujrat",5500,true);
		FactoryEntity factoryEntity3= new FactoryEntity(4,"mukesh ambani","petrolium ","ahamdabad,",6000,true);
		FactoryEntity factoryEntity4= new FactoryEntity(5,"anil ambani","telecom","mumbai",2500,true);

		
		FactoryDAOImpl factoryDAOImpl= new FactoryDAOImpl();
		factoryDAOImpl.save(factoryEntity1);
		factoryDAOImpl.save(factoryEntity2);
		factoryDAOImpl.save(factoryEntity3);
		factoryDAOImpl.save(factoryEntity4);
	
		
		
		
	}

}
