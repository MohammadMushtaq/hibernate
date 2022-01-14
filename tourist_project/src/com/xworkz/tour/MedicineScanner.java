package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

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
		MedicineEntity medicineEntity6=new MedicineEntity(6, "pentozol", "gas", "corona", true);
		MedicineEntity medicineEntity7=new MedicineEntity(7, "aten50", "bp", "para", true);
		MedicineEntity medicineEntity8=new MedicineEntity(8, "acetaminophen", "cafine", "para", true);
		MedicineEntity medicineEntity9=new MedicineEntity(9, "asprin", "headache", "para", true);
		MedicineEntity medicineEntity10=new MedicineEntity(10, "Metformin", "pain", "corona", true);
		MedicineEntity medicineEntity11=new MedicineEntity(11, "Amlodipine", "pain", "amtri", true);
		MedicineEntity medicineEntity12=new MedicineEntity(12, "Metoprolol", "neckpain", "corona", true);
		MedicineEntity medicineEntity13=new MedicineEntity(13, "Omeprazole", "pain", "corona", false);
		MedicineEntity medicineEntity14=new MedicineEntity(14, "Simvastatin", "fever", "amtri", true);
		MedicineEntity medicineEntity15=new MedicineEntity(15, "Losartan", "pain", "amtri", true);
		MedicineEntity medicineEntity16=new MedicineEntity(16, "Albutero", "pain", "amtri", false);
		MedicineEntity medicineEntity17=new MedicineEntity(17, "Azithromycin", "pain", "amtri", true);
		MedicineEntity medicineEntity18=new MedicineEntity(18, "tamoxifen ", "pain", "amtri", true);
		MedicineEntity medicineEntity19=new MedicineEntity(19, "raloxifene", "pain", "amtri", true);
		MedicineEntity medicineEntity20=new MedicineEntity(20, "Chemoprevention ", "pain", "amtri", true);
		MedicineEntity medicineEntity21=new MedicineEntity(21, "Perjeta", "bp", "MabThera", true);
		MedicineEntity medicineEntity22=new MedicineEntity(22, "Avastin", "pain", "Roche", true);
		MedicineEntity medicineEntity23=new MedicineEntity(23, "Herceptin", "pain", "trastuzumab", false);
		MedicineEntity medicineEntity24=new MedicineEntity(24, "obinutuzumab", "brest cancer", "Gazyva", true);
		MedicineEntity medicineEntity25=new MedicineEntity(25, "ruxolitinib", "pain", "Jakafi", true);
		MedicineEntity medicineEntity26=new MedicineEntity(26, "venetoclax", "cancer", "Venclexta", true);
		MedicineEntity medicineEntity27=new MedicineEntity(27, "rituximab", "pain", "Rituxan", true);
		MedicineEntity medicineEntity28=new MedicineEntity(28, "pembrolizumab", "pain", "immunotherapy ", true);
		MedicineEntity medicineEntity29=new MedicineEntity(29, "glimepiride ", "daibetes", "Amaryl", true);
		MedicineEntity medicineEntity30=new MedicineEntity(30, "gliclazide", "pain", "amtri", true);
		MedicineEntity medicineEntity31=new MedicineEntity(31, "glipizide ", "pain", "Glucotrol", true);
		MedicineEntity medicineEntity32=new MedicineEntity(32, "glyburide ", "pain", "DiaBeta", true);
		MedicineEntity medicineEntity33=new MedicineEntity(33, "metformin ", "daibetes", "Glucovance", true);
		MedicineEntity medicineEntity34=new MedicineEntity(34, "Insulin ", "diabetes", "amtri", true);
		
		
		List<MedicineEntity> list= new ArrayList<MedicineEntity>();
		list.add(medicineEntity1);list.add(medicineEntity11);
		list.add(medicineEntity2);list.add(medicineEntity12);
		list.add(medicineEntity3);list.add(medicineEntity13);
		list.add(medicineEntity4);list.add(medicineEntity14);
		list.add(medicineEntity5);list.add(medicineEntity15);
		list.add(medicineEntity6);list.add(medicineEntity16);
		list.add(medicineEntity7);list.add(medicineEntity17);
		list.add(medicineEntity8);list.add(medicineEntity18);
		list.add(medicineEntity9);list.add(medicineEntity19);
		list.add(medicineEntity10);list.add(medicineEntity20);
		list.add(medicineEntity21);list.add(medicineEntity28);
		list.add(medicineEntity22);list.add(medicineEntity29);
		list.add(medicineEntity23);list.add(medicineEntity30);
		list.add(medicineEntity24);list.add(medicineEntity31);
		list.add(medicineEntity25);list.add(medicineEntity32);
		list.add(medicineEntity26);list.add(medicineEntity33);
		list.add(medicineEntity27);list.add(medicineEntity34);
		
		MedicineDAO dao= new MedicineDAOImpl();
	//	dao.save(medicineEntity2);		
		
		dao.saveAll(list);
	}
}
