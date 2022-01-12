package com.xworkz.tour;

import com.xworkz.tour.dao.MedicineDAO;
import com.xworkz.tour.dao.MedicineDAOImpl;
import com.xworkz.tour.entity.MedicineEntity;

public class MedicineScanner {

	public static void main(String[] args) {

		MedicineEntity medicineEntity1= new MedicineEntity(1,"paracetumol500","fever","paracetumol",true);
		MedicineEntity medicineEntity2= new MedicineEntity(2,"dolo650","fever","paracetumol",true);
		MedicineEntity medicineEntity3= new MedicineEntity(3,"citrizen","cold","paracetumol",false);
		MedicineEntity medicineEntity4= new MedicineEntity(4,"vicsaction500","caugh","visc",true);
		MedicineEntity medicineEntity5= new MedicineEntity(5,"aten500","sugar","paracetumol",false);
		
		MedicineDAO dao= new MedicineDAOImpl();
		dao.save(medicineEntity1);
		dao.save(medicineEntity2);
		dao.save(medicineEntity3);
		dao.save(medicineEntity4);
		dao.save(medicineEntity5);
	}

}
