package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

import com.xworkz.tour.dao.TouristPlaceDAO;
import com.xworkz.tour.dao.TouristPlaceDAOImpl;
import com.xworkz.tour.entity.TouristPlaceEntity;

public class TouristScanner {

	public static void main(String[] args) {
		
		TouristPlaceEntity entity1= new TouristPlaceEntity(1, "nandihills", "bangalore", 1120d, "dosa", "summer");
		TouristPlaceEntity entity2= new TouristPlaceEntity(2, "statue of unity", "gujrat", 1200d, "fafda", "ranny");
		TouristPlaceEntity entity3= new TouristPlaceEntity(3, "vidha sabha", "delhi", 1100d, "kajukatli", "winter");
		TouristPlaceEntity entity4= new TouristPlaceEntity(4, "beach", "mangalore", 120d, "mangalore bajji", "summer");
		TouristPlaceEntity entity5= new TouristPlaceEntity(5, "kalangud beach", "goa", 1100d, "wine", "summer");
		TouristPlaceEntity entity6= new TouristPlaceEntity(6, "forest", "sandur", 1520d, "mines", "summer");
		TouristPlaceEntity entity7= new TouristPlaceEntity(7, "fort", "bellary", 950d, "idli", "winter");
		TouristPlaceEntity entity8= new TouristPlaceEntity(8, "temples", "chennai", 1450d, "dosa", "winter");
		TouristPlaceEntity entity9= new TouristPlaceEntity(9, "kerlaboating", "kerla", 1520d, "fish", "spring");
		TouristPlaceEntity entity10= new TouristPlaceEntity(10, "charminar", "hydrabad", 890d, "biryani", "winter");
		TouristPlaceEntity entity11= new TouristPlaceEntity(11, "golden temple", "punjab", 720d, "lassi", "winter");
		TouristPlaceEntity entity12= new TouristPlaceEntity(12, "pyakara falls", "ooty", 1520d, "forest", "spring");
		TouristPlaceEntity entity13= new TouristPlaceEntity(13, "beach", "rameshwaram", 1220d, "apj birth place", "ranny");
		TouristPlaceEntity entity14= new TouristPlaceEntity(14, "dharwad university", "dharwad", 1270d, "dharwad peda", "spring");
		TouristPlaceEntity entity15= new TouristPlaceEntity(15, "snow fall", "kashmir", 1450d, "sweet", "spring");
		TouristPlaceEntity entity16= new TouristPlaceEntity(16, "kashi temple", "varanasi", 1020d, "temple", "spring");
		TouristPlaceEntity entity17= new TouristPlaceEntity(17, "gate way", "mumbai", 920d, "voda pav", "spring");
		TouristPlaceEntity entity18= new TouristPlaceEntity(18, "amer fort", "jaipur", 250d, "palaces", "spring");
		TouristPlaceEntity entity19= new TouristPlaceEntity(19, "mysore palaces", "mysore", 1220d, "forest", "spring");
		TouristPlaceEntity entity20= new TouristPlaceEntity(20, "woundela", "bangalore", 1230d, "dosa", "spring");
		TouristPlaceEntity entity21= new TouristPlaceEntity(21, "periyar national park", "madurai", 1220d, "tigers", "spring");
		TouristPlaceEntity entity22= new TouristPlaceEntity(22, "bengal tiger forest", "temple", 1220d, "rasgulla", "spring");
		TouristPlaceEntity entity23= new TouristPlaceEntity(23, "the stone chariot", "hampi", 1220d, "puttu", "spring");
		TouristPlaceEntity entity24= new TouristPlaceEntity(24, "yellora cave", "aurangabad", 1000d, "food", "spring");
		TouristPlaceEntity entity25= new TouristPlaceEntity(25, "hawa mahal", "jaipur", 652d, "clothes", "spring");
		TouristPlaceEntity entity26= new TouristPlaceEntity(26, "hill station", "manali", 554d, "hills", "spring");
		TouristPlaceEntity entity27= new TouristPlaceEntity(27, "leh ladak", "ladak", 1220d, "saichen galcier", "winter");
		TouristPlaceEntity entity28= new TouristPlaceEntity(28, "coffee production", "coorg", 1220d, "mountains", "spring");
		TouristPlaceEntity entity29= new TouristPlaceEntity(29, "island", "andaman", 325d, "beach", "spring");
		TouristPlaceEntity entity30= new TouristPlaceEntity(30, "lakes", "udaipur", 1580d, "temples", "spring");
		TouristPlaceEntity entity31= new TouristPlaceEntity(31, "bank of river", "srinagar", 1220d, "house boats", "winter");
		TouristPlaceEntity entity32= new TouristPlaceEntity(32, "rishikesh", "utrakand", 365d, "foothills", "summer");
		TouristPlaceEntity entity33= new TouristPlaceEntity(33, "alleppey", "kerla", 1220d, "boat sports", "spring");
		TouristPlaceEntity entity34= new TouristPlaceEntity(34, "hill station", "nainital", 542d, "beach", "spring");
		TouristPlaceEntity entity35= new TouristPlaceEntity(35, "sashyadri", "lonavla", 1220d, "wateralls", "spring");
		TouristPlaceEntity entity36= new TouristPlaceEntity(36, "hill station", "mussoorie", 1001d, "sivalik range", "spring");
		TouristPlaceEntity entity37= new TouristPlaceEntity(37, "water falls", "koidaikenal", 120d, "green spots", "winter");
		TouristPlaceEntity entity38= new TouristPlaceEntity(38, "mount abu", "rajastan", 1270d, "temples", "spring");
		TouristPlaceEntity entity39= new TouristPlaceEntity(39, "beach", "pondicherry", 2220d, "idli", "spring");
		TouristPlaceEntity entity40= new TouristPlaceEntity(40, "vaishonodevi", "trikuta hills", 1220d, "sweet", "spring");
		TouristPlaceEntity entity41= new TouristPlaceEntity(41, "ajanta and yellora cave", "aurangabad", 1051d, "caves", "spring");
		TouristPlaceEntity entity42= new TouristPlaceEntity(42, "haridwar", "uttara kand", 321d, "ashrams", "spring");
		TouristPlaceEntity entity43= new TouristPlaceEntity(43, "humayu tomp", "delhi", 1231, "fort", "spring");
		TouristPlaceEntity entity44= new TouristPlaceEntity(44, "pyramid", "greek", 1208, "pyramid", "spring");
		TouristPlaceEntity entity45= new TouristPlaceEntity(45, "great wall", "china", 1220d, "mobiles", "spring");
		TouristPlaceEntity entity46= new TouristPlaceEntity(46, "ifel tower", "london", 1220d, "puttu", "spring");
		TouristPlaceEntity entity47= new TouristPlaceEntity(47, "karla", "temple", 1220d, "puttu", "spring");
		TouristPlaceEntity entity48= new TouristPlaceEntity(48, "ajmeer sharif", "ajmeer", 1232, "darga", "spring");
		TouristPlaceEntity entity49= new TouristPlaceEntity(49, "golgumbaj", "bijapur", 2031, "sweet", "spring");
		TouristPlaceEntity entity50= new TouristPlaceEntity(50, "khwaja bande nawaz darga", "gulbarga", 458d, "sweet", "spring");
		TouristPlaceEntity entity51= new TouristPlaceEntity(51, "haji ali", "mumbai", 458d, "vada pav", "spring");
		TouristPlaceEntity entity52= new TouristPlaceEntity(52, "hampi temple", "hampi", 782d, "temples", "winter");
		TouristPlaceEntity entity53= new TouristPlaceEntity(53, "lotus mehal", "delhi", 1220d, "sweet", "spring");
		TouristPlaceEntity entity54= new TouristPlaceEntity(54, "tajmahal", "agra", 1500d, "peta", "winter");
		
		List<TouristPlaceEntity> list= new ArrayList<TouristPlaceEntity>();
		
//		list.add(entity19);list.add(entity37);
//		list.add(entity2);list.add(entity20);list.add(entity38);
//		list.add(entity3);list.add(entity21);list.add(entity39);
//		list.add(entity4);list.add(entity22);list.add(entity40);
//		list.add(entity5);list.add(entity23);list.add(entity41);
//		list.add(entity6);list.add(entity24);list.add(entity42);
//		list.add(entity7);list.add(entity25);list.add(entity43);
//		list.add(entity8);list.add(entity26);list.add(entity44);
//		list.add(entity9);list.add(entity27);list.add(entity45);
//		list.add(entity10);list.add(entity28);list.add(entity46);
//		list.add(entity11);list.add(entity29);list.add(entity47);
//		list.add(entity12);list.add(entity30);list.add(entity48);
//		list.add(entity13);list.add(entity31);list.add(entity49);
//		list.add(entity14);list.add(entity32);list.add(entity50);
//		list.add(entity15);list.add(entity33);list.add(entity51);
//		list.add(entity16);list.add(entity34);list.add(entity52);
//		list.add(entity17);list.add(entity35);list.add(entity53);
//		list.add(entity18);list.add(entity36);list.add(entity54);
		list.add(entity1);
		
	TouristPlaceDAO tour = new TouristPlaceDAOImpl();
	tour.saveAll(list);
			
			
			
			
	}

}
