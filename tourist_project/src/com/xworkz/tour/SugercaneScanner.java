package com.xworkz.tour;

import com.xworkz.tour.dao.SugercaneDAO;
import com.xworkz.tour.dao.SugercaneDAOImpl;
import com.xworkz.tour.entity.SugercaneEntity;

public class SugercaneScanner {

	public static void main(String[] args) {
		SugercaneEntity sugercaneEntity1 = 
		new SugercaneEntity(1,"krishna factory","siruguppa","150",true,"sugerfactory");
		SugercaneEntity sugercaneEntity2 = 
				new SugercaneEntity(2,"ram factory","kartagi","250",true,"finesugerfactory");
		SugercaneEntity sugercaneEntity3 = 
				new SugercaneEntity(3,"manju factory","sindanur","410",false,"sugerfactory");
		SugercaneEntity sugercaneEntity4 = 
				new SugercaneEntity(4,"ramu factory","bellary","550",true,"sugerfactory1");
		SugercaneEntity sugercaneEntity5 = 
				new SugercaneEntity(5,"jeeva factory","mysore","450",false,"sugerfactory2");

		SugercaneDAO sugercaneDAO= new SugercaneDAOImpl();
		sugercaneDAO.save(sugercaneEntity1);
		sugercaneDAO.save(sugercaneEntity2);
		sugercaneDAO.save(sugercaneEntity3);
		sugercaneDAO.save(sugercaneEntity4);
		sugercaneDAO.save(sugercaneEntity5);
	}

}
