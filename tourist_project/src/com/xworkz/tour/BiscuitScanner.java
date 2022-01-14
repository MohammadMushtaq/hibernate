package com.xworkz.tour;

import com.xworkz.tour.dao.BiscuitDAO;
import com.xworkz.tour.dao.BiscuitDAOImpl;
import com.xworkz.tour.entity.BiscuitEntity;

public class BiscuitScanner {

	public static void main(String[] args) {

		BiscuitEntity biscuitEntity1 = new BiscuitEntity(1,"parle-g","teabiscuit","true",10,"yes");
		BiscuitEntity biscuitEntity2 = new BiscuitEntity(2,"marie-gold","sweet","true",20,"yes");
		BiscuitEntity biscuitEntity3 = new BiscuitEntity(3,"sunfest","cream","true",30,"yes");
		BiscuitEntity biscuitEntity4 = new BiscuitEntity(4,"momsmagic","sweet","true",15,"yes");
		BiscuitEntity biscuitEntity5 = new BiscuitEntity(5,"hideandseek","black","true",25,"yes");
	
	BiscuitDAO dao= new BiscuitDAOImpl();
//	dao.save(biscuitEntity1);
//	dao.save(biscuitEntity2);
	dao.save(biscuitEntity3);
	dao.save(biscuitEntity4);
	dao.save(biscuitEntity5);
	

	}
	
	

}
