package com.xworkz.tour;

import java.util.ArrayList;

import java.util.List;

import com.xworkz.tour.dao.AirportDAO;
import com.xworkz.tour.dao.AirportDAOImpl;
import com.xworkz.tour.entity.AirportEntity;

public class AirportSacnner {

	public static void main(String[] args) {
		AirportEntity airportEntity1= new AirportEntity(1,"chatrapati","international","mumbai",
				"mumbai","usa",true);
		AirportEntity airportEntity2= new AirportEntity(2,"kerla","international","kochi",
				"kochi","dubai",true);
		
		AirportEntity airportEntity3= new AirportEntity(3,"ravigandi","international","hydrabad",
				"banglaore","hydrabad",true);
		
		AirportEntity airportEntity4= new AirportEntity(4,"kempegouda","international","bangalore",
				"bangalore","cannada",true);
		
		AirportEntity airportEntity5= new AirportEntity(5,"chennai ia","international","chennai",
				"kanyakumari","bangalore",true);
		AirportEntity airportEntity6= new AirportEntity(6,"goa ia","domastic","gao",
				"bangalore","bangalore",true);
		AirportEntity airportEntity7= new AirportEntity(7,"kochi","international","kochi",
				"kochi","chennai",true);
		AirportEntity airportEntity8= new AirportEntity(8,"chennai","international","chennai",
				"chennai","bangalore",true);
		AirportEntity airportEntity9= new AirportEntity(9,"sradar vallabai Ia","international","ahamdabad",
				"ahabadad","madras",true);
		AirportEntity airportEntity10= new AirportEntity(10,"jaipur ia","international","jaipur",
				"jaipur","mumbai",true);
		AirportEntity airportEntity11= new AirportEntity(11,"pune ia","international","pune",
				"pune","hubli",true);
		AirportEntity airportEntity12= new AirportEntity(12,"hubli","domestic","hubli",
				"hubli","hydrabad",true);
		AirportEntity airportEntity13= new AirportEntity(13,"jsw airport","domestic","tornagallu",
				"jsw","hydrabad",true);
		AirportEntity airportEntity14= new AirportEntity(14,"mangaluru ia","international","mangaluru",
				"mangaluru","kerla",true);
		AirportEntity airportEntity15= new AirportEntity(15,"Jay Prakash Narayan Airport","international","patna",
				"patna","bangalore",true);
		AirportEntity airportEntity16= new AirportEntity(16,"Swami Vivekananda Airport","international","raipur",
				"raipur","gujrat",true);
		AirportEntity airportEntity17= new AirportEntity(17,"Sardar Vallabhbhai Patel International Airport","international","ahmedabad",
				"ahmedabad","chennai",true);
		AirportEntity airportEntity18= new AirportEntity(18,"Rajkot Airport","international","Rajkot",
				"Rajkot","hydrabad",true);
		AirportEntity airportEntity19= new AirportEntity(19,"Surat Airport","international","gujrat",
				"Surat","rajkot",true);
		AirportEntity airportEntity20= new AirportEntity(20,"Ambala Air Force Station","international","haryana",
				"ambala","jaipur",true);
		AirportEntity airportEntity21= new AirportEntity(21,"Vadodara Airport","international","Vadodara",
				"Vadodara","bihar",true);
		AirportEntity airportEntity22= new AirportEntity(22,"Kangra Airport","international","Kangra",
				"Kangra","raipur",true);
		AirportEntity airportEntity23= new AirportEntity(23,"Bokaro Airport","international","chennai",
				"kanyakumari","bangalore",true);
		AirportEntity airportEntity24= new AirportEntity(24,"Dhana Airport","international","sagar",
				"sagar","delhi",true);
		AirportEntity airportEntity25= new AirportEntity(25,"Ujjain Airstrip","international","Ujjain",
				"Ujjain","bangalore",true);
		AirportEntity airportEntity26= new AirportEntity(26,"Chhatrapati Rajaram Maharaj Airport","international","kolhapur",
				"kolhapur","ahamdabad",true);
		AirportEntity airportEntity27= new AirportEntity(27,"Latur Airport","international","Latur",
				"Latur","bangalore",true);
		AirportEntity airportEntity28= new AirportEntity(28,"Ratnagiri Airport","international","mumbai",
				"Ratnagiri","hubli",true);
		AirportEntity airportEntity29= new AirportEntity(29,"Solapur Airport","international","Solapur",
				"Solapur","belgaum",true);
		AirportEntity airportEntity30= new AirportEntity(30,"Calicut International Airport","international","chennaiKozhikode",
				"Kozhikode,","jaipur",true);
		AirportEntity airportEntity31= new AirportEntity(31,"Gwalior Airport","international","Gwalior",
				"Gwalior","rajkot",true);
		AirportEntity airportEntity32= new AirportEntity(32,"Raja Bhoj Airport","international","bhopal",
				"bhopal","kochi",true);
		AirportEntity airportEntity33= new AirportEntity(33,"Trivandrum International Airport","international","kerla",
				"Trivandrum","goa",true);
		AirportEntity airportEntity34= new AirportEntity(34,"Kannur International Airport","international","kerla",
				"kerla","chennai",true);
		AirportEntity airportEntity35= new AirportEntity(35,"Shivamogga Airport","international","Shivamogga",
				"Shivamogga","bangalore",true);
		AirportEntity airportEntity36= new AirportEntity(36,"Raichur Airport","domestic","Raichur",
				"Raichur","goa",false);
		AirportEntity airportEntity37= new AirportEntity(37,"Mysore Airport","international","Mysore",
				"Mysore","bangalore",true);
		AirportEntity airportEntity38= new AirportEntity(38,"gulbarga Airport" ,"domestic","gulbarga",
				"gulbarga","hasan",true);
		AirportEntity airportEntity39= new AirportEntity(39,"Hassan Airport","international","Hassan",
				"Hassan","gulbarga",true);
		AirportEntity airportEntity40= new AirportEntity(40,"Harihar Airport","international","Harihar",
				"Harihar","bangalore",true);
		AirportEntity airportEntity41= new AirportEntity(41,"Chitradurga Aeronautical Test Range","international","chitradurga",
				"chitradurga","bangalore",true);
		AirportEntity airportEntity42= new AirportEntity(42,"karwar airport","international","karwar",
				"karwar","hubli",false);
		AirportEntity airportEntity43= new AirportEntity(43,"Bijapur Airport","international","Bijapur",
				"Bijapur","karwar",true);
		AirportEntity airportEntity44= new AirportEntity(44,"Yelahanka Air Force Station","international","bangalore",
				"bangalore","delhi",true);
		AirportEntity airportEntity45= new AirportEntity(45,"HAL Airport","international","bangalore",
				"banaglore","jsw",true);
		AirportEntity airportEntity46= new AirportEntity(46,"Bellary Airport","domestic","Bellary",
				"Bellary","hydrabad",false);
		AirportEntity airportEntity47= new AirportEntity(47,"Dhalbhumgarh Airport","international","Jamshedpur",
				"Jamshedpur","bangalore",true);			
		AirportEntity airportEntity48= new AirportEntity(48,"Bokaro Airport","international","Jharkhand",
				"Bokaro","kochi",true);
		
		
		List<AirportEntity> list= new ArrayList<AirportEntity>();
		list.add(airportEntity1);list.add(airportEntity22);list.add(airportEntity43);
		list.add(airportEntity2);list.add(airportEntity23);list.add(airportEntity44);
		list.add(airportEntity3);list.add(airportEntity24);list.add(airportEntity45);
		list.add(airportEntity4);list.add(airportEntity25);list.add(airportEntity46);
		list.add(airportEntity5);list.add(airportEntity26);list.add(airportEntity47);
		list.add(airportEntity6);list.add(airportEntity27);list.add(airportEntity48);
		list.add(airportEntity7);list.add(airportEntity28);
		list.add(airportEntity8);list.add(airportEntity29);
		list.add(airportEntity9);list.add(airportEntity30);
		list.add(airportEntity10);list.add(airportEntity31);
		list.add(airportEntity11);list.add(airportEntity32);
		list.add(airportEntity12);list.add(airportEntity33);
		list.add(airportEntity13);list.add(airportEntity34);
		list.add(airportEntity14);list.add(airportEntity35);
		list.add(airportEntity15);list.add(airportEntity36);
		list.add(airportEntity16);list.add(airportEntity37);
		list.add(airportEntity17);list.add(airportEntity38);
		list.add(airportEntity18);list.add(airportEntity39);
		list.add(airportEntity19);list.add(airportEntity40);
		list.add(airportEntity20);list.add(airportEntity41);
		list.add(airportEntity21);list.add(airportEntity42);
		
		
		AirportDAO dao= new AirportDAOImpl();
		dao.saveAll(list);
		

	}

}
