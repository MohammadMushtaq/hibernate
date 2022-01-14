package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.RailwayDAOImpl;
import com.xworkz.tour.dao.RailwayStationDAO;
import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.entity.RailwayEntity;

public class RailwayScanner {

	public static void main(String[] args) {

		RailwayEntity railwayEntity1= new RailwayEntity(1,"bellary station",4,"bellary","bangalore",45);
		RailwayEntity railwayEntity2= new RailwayEntity(2,"hampi station",3,"hampi","vijayawada",55);
		RailwayEntity railwayEntity3= new RailwayEntity(3,"mysore station",5,"mysore","amravati",150);
		RailwayEntity railwayEntity4= new RailwayEntity(4,"delhi station",8,"agra","delhi",145);
		RailwayEntity railwayEntity5= new RailwayEntity(5,"agra station",9,"agra ","mysore",35);
		RailwayEntity railwayEntity6= new RailwayEntity(6,"bangalore station",10,"bangalore","mumbai",11);
		RailwayEntity railwayEntity7= new RailwayEntity(7,"yehwnthpur station",4,"mangalore","kochi",12);
		RailwayEntity railwayEntity8= new RailwayEntity(8,"tirvantapuram station",9,"mangalore","kochi",15);
		RailwayEntity railwayEntity9= new RailwayEntity(9,"muzzaffar nagar",6,"lonvala","kandala",14);
		RailwayEntity railwayEntity10= new RailwayEntity(10,"jaipur station",15,"jaipur","gujrat",8);
		RailwayEntity railwayEntity11= new RailwayEntity(11,"rajastan station",20,"rajastan","odisa",8);
		RailwayEntity railwayEntity12= new RailwayEntity(12,"odisa ",7,"odisa","bihar",7);
		RailwayEntity railwayEntity13= new RailwayEntity(13,"Ahmedabad",3,"gurajat","ranchi",6);
		RailwayEntity railwayEntity14= new RailwayEntity(14,"Ahraura Road",2,"mangalore","kochi",21);
		RailwayEntity railwayEntity15= new RailwayEntity(15,"chennai",7,"selam","delhi",56);
		RailwayEntity railwayEntity16= new RailwayEntity(16,"hyrabad",3,"hydrabad","guntoor",42);
		RailwayEntity railwayEntity17= new RailwayEntity(17,"vijayawada",1,"vijayawada","rajastan",66);
		RailwayEntity railwayEntity18= new RailwayEntity(18,"Baktal",3,"batkal","mangalore",77);
		RailwayEntity railwayEntity19= new RailwayEntity(19,"bijaur",2,"bijapur","bellary",23);
		RailwayEntity railwayEntity20= new RailwayEntity(20,"gugaoun",1,"gurgoun","new delhi",15);
		RailwayEntity railwayEntity21= new RailwayEntity(21,"shivmogga",5,"shivmogaa","mysore",13);
		RailwayEntity railwayEntity22= new RailwayEntity(22,"Chakarbhatha",4,"Chakarbhatha","kochi",12);
		RailwayEntity railwayEntity23= new RailwayEntity(23,"Chakarlapalli",1,"Chakarlapalli","tripua",8);
		RailwayEntity railwayEntity24= new RailwayEntity(24,"pune",2,"pune","hubli",32);
		RailwayEntity railwayEntity25= new RailwayEntity(25,"dharwad ",2,"dharwad","belgum",33);
		RailwayEntity railwayEntity26= new RailwayEntity(26,"manipal",11,"manipal","kochi",49);
		RailwayEntity railwayEntity27= new RailwayEntity(27,"Mumbai",14,"mangalore","kochi",48);
		RailwayEntity railwayEntity28= new RailwayEntity(28,"salam",16,"salam","rameshwaram",46);
		RailwayEntity railwayEntity29= new RailwayEntity(29,"rameshwaram",17,"rameshwaram","bangalore",62);
		RailwayEntity railwayEntity30= new RailwayEntity(30,"Dagarhkeri",16,"mangalore","kochi",65);
		RailwayEntity railwayEntity31= new RailwayEntity(31,"adoni",19,"adoni","trupati",61);
		RailwayEntity railwayEntity32= new RailwayEntity(32,"kodikenal",20,"kodikenal","chennai",12);
		RailwayEntity railwayEntity33= new RailwayEntity(33,"amravati",5,"amravati","vijayawada",13);
		RailwayEntity railwayEntity34= new RailwayEntity(34,"dharmawaram ",6,"dharmawaram","bellary",14);
		RailwayEntity railwayEntity35= new RailwayEntity(35,"kadur",7,"kadur","bangalore",15);
		RailwayEntity railwayEntity36= new RailwayEntity(36,"New Delhi",9,"new delhi","rajastan",28);
		RailwayEntity railwayEntity37= new RailwayEntity(37,"munnar",14,"munnar","mangalore",27);
		RailwayEntity railwayEntity38= new RailwayEntity(38,"Haldaur",6,"mangalore","kochi",29);
		RailwayEntity railwayEntity39= new RailwayEntity(39,"Hamirgarh",14,"mangalore","kochi",30);
		RailwayEntity railwayEntity40= new RailwayEntity(40,"Hapur",16,"mangalore","kochi",25);
		RailwayEntity railwayEntity41= new RailwayEntity(41,"Harihar",17,"mangalore","kochi",72);
		RailwayEntity railwayEntity42= new RailwayEntity(42,"Kolkata",12,"kolkata","chennai",65);
		RailwayEntity railwayEntity43= new RailwayEntity(43,"Hubli Junction",10,"hubli","bellary",74);
		RailwayEntity railwayEntity44= new RailwayEntity(44,"Ibrahimpur",12,"ibrahimpur","muzaffar nagar",71);
		RailwayEntity railwayEntity45= new RailwayEntity(45,"trupati",20,"tiupati","guntakal",72);
		RailwayEntity railwayEntity46= new RailwayEntity(46,"gandinagar",24,"gandinagar","mumbai",39);
		RailwayEntity railwayEntity47= new RailwayEntity(47,"Islampur",15,"Islampur","odisa",37);
		RailwayEntity railwayEntity48= new RailwayEntity(48,"Anatapur",15,"Anatapur","vijaywada",36);
		RailwayEntity railwayEntity49= new RailwayEntity(49,"Izzatnagar",23,"Izzatnagar","nagpur",32);
		RailwayEntity railwayEntity50= new RailwayEntity(50,"nagpur",22,"nagpur","rajastan",30);
		RailwayEntity railwayEntity51= new RailwayEntity(51,"guntakal junction",19,"guntakal","kochi",29);
		RailwayEntity railwayEntity52= new RailwayEntity(52,"Jairamnagar",18,"mangalore","kochi",28);
		RailwayEntity railwayEntity53= new RailwayEntity(53,"Jakhapura",21,"Jakhapura","mangalore",26);
		RailwayEntity railwayEntity54= new RailwayEntity(54,"",24,"Jakhvada","kochi",27);
		RailwayEntity railwayEntity55= new RailwayEntity(55,"Japla",25,"Japla","tripura",20);
		RailwayEntity railwayEntity56= new RailwayEntity(56,"Kakori",8,"Kakori","kochi",15);
		RailwayEntity railwayEntity57= new RailwayEntity(57,"Kalanaur ",9,"Kalanaur","kerala",17);
		RailwayEntity railwayEntity58= new RailwayEntity(58,"himachal pradesh",10,"himachal pradesh","kasmir",15);
		RailwayEntity railwayEntity59= new RailwayEntity(59,"kashmir",14,"kashmir","kanyakumari",65);
		RailwayEntity railwayEntity60= new RailwayEntity(60,"nagpur ",11,"nagpur","delhi",35);
		RailwayEntity railwayEntity61= new RailwayEntity(61,"Naya Nangal",8,"mangalore","kochi",25);
		RailwayEntity railwayEntity62= new RailwayEntity(62,"New Amravat",15,"New Amravat","kochi",15);
		RailwayEntity railwayEntity63= new RailwayEntity(63,"ranchi",4,"ranchi","gujrat",75);
		RailwayEntity railwayEntity64= new RailwayEntity(64,"panji",9,"panji","hubli",47);
		RailwayEntity railwayEntity65= new RailwayEntity(65,"vasko di gama",4,"vasko","pune",44);
		RailwayEntity railwayEntity66= new RailwayEntity(66,"manglore",9,"mangalore","kochi",42);
		RailwayEntity railwayEntity67= new RailwayEntity(67,"darjaling",8,"darjaling","delhi",41);
		RailwayEntity railwayEntity68= new RailwayEntity(68,"asam",4,"asam","darjaling",75);
		RailwayEntity railwayEntity69= new RailwayEntity(69,"Odha",12,"Odha","navi mumbai",62);
		RailwayEntity railwayEntity70= new RailwayEntity(70,"kudtini",8,"kudtini","bellary",55);
		RailwayEntity railwayEntity71= new RailwayEntity(71,"hospet",5,"hospet","bangalore",74);
		RailwayEntity railwayEntity72= new RailwayEntity(72,"gadag",3,"gadag","shivmogga",19);
		RailwayEntity railwayEntity73= new RailwayEntity(73,"koppal",6,"koppal","dharwad",15);
		

		List<RailwayEntity> list= new ArrayList<RailwayEntity>();
//		list.add(railwayEntity1);list.add(railwayEntity33);
//		list.add(railwayEntity2);list.add(railwayEntity34);
//		list.add(railwayEntity3);list.add(railwayEntity35);
//		list.add(railwayEntity4);list.add(railwayEntity36);
//		list.add(railwayEntity5);list.add(railwayEntity37);
//		list.add(railwayEntity6);list.add(railwayEntity38);
//		list.add(railwayEntity7);list.add(railwayEntity39);
//		list.add(railwayEntity8);list.add(railwayEntity40);
//		list.add(railwayEntity9);list.add(railwayEntity41);
//		list.add(railwayEntity10);list.add(railwayEntity42);
//		list.add(railwayEntity11);list.add(railwayEntity43);
//		list.add(railwayEntity12);list.add(railwayEntity44);
//		list.add(railwayEntity13);list.add(railwayEntity45);
//		list.add(railwayEntity14);list.add(railwayEntity46);
//		list.add(railwayEntity15);list.add(railwayEntity48);
//		list.add(railwayEntity16);list.add(railwayEntity49);
//		list.add(railwayEntity17);list.add(railwayEntity50);
//		list.add(railwayEntity18);list.add(railwayEntity51);
//		list.add(railwayEntity19);list.add(railwayEntity52);
//		list.add(railwayEntity20);list.add(railwayEntity53);
//		list.add(railwayEntity21);list.add(railwayEntity54);
//		list.add(railwayEntity22);list.add(railwayEntity55);
//		list.add(railwayEntity23);list.add(railwayEntity56);
//		list.add(railwayEntity24);list.add(railwayEntity57);
//		list.add(railwayEntity25);list.add(railwayEntity58);
//		list.add(railwayEntity26);list.add(railwayEntity59);
//		list.add(railwayEntity27);list.add(railwayEntity60);
//		list.add(railwayEntity28);list.add(railwayEntity61);
//		list.add(railwayEntity29);list.add(railwayEntity62);
//		list.add(railwayEntity30);list.add(railwayEntity63);
//		list.add(railwayEntity31);list.add(railwayEntity64);
//		list.add(railwayEntity32);list.add(railwayEntity65);
//		list.add(railwayEntity66);list.add(railwayEntity67);
//		list.add(railwayEntity67);list.add(railwayEntity68);
//		list.add(railwayEntity69);list.add(railwayEntity70);
//		list.add(railwayEntity71);list.add(railwayEntity72);
		list.add(railwayEntity47);
		
		RailwayStationDAO dao = new RailwayDAOImpl();
		dao.saveAll(list);
		
	}
}
