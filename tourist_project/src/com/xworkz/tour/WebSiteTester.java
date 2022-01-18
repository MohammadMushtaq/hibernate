package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.WebSiteDAOImpl;
import com.xworkz.tour.dao.WebsiteDAO;
import com.xworkz.tour.entity.WebSiteEntity;

public class WebSiteTester {

	public static void main(String[] args) {
		
		List<WebSiteEntity> list= new ArrayList<WebSiteEntity>();
		list.add(new WebSiteEntity("google", "software","larry page", 1945, "www.google.com")); 
		list.add(new WebSiteEntity("facebook", "socail networking ", "mark zukerberg", 2010, "www.facebook.com"));
		list.add(new WebSiteEntity("blogger", "content manager", "Evan Williams", 1999, "www.blogger.com"));
		list.add(new WebSiteEntity("youtube", "Entertainment", "san matio", 2005, "www.youtube.com"));
		list.add(new WebSiteEntity("whatsapp", "socail site", "Jan Koum", 2014, "wwww.whatsapp.com"));
		list.add(new WebSiteEntity("apple", "electronic", "steve jobs",1976, "wwww.apple.com"));
		list.add(new WebSiteEntity("microsoft", "e-commerece","bill gates", 1995, "www.microsoft.com"));
		list.add(new WebSiteEntity("adobe", "software", "Charles Geschke",1982 , "www.adobe.com"));
		list.add(new WebSiteEntity("imdb", "internet movie database", "Col Needham",1998, "www.imdb.com"));
		list.add(new WebSiteEntity("bbc","News broadCasting", "HM Government", 1992, "www.bbc.com"));
		list.add(new WebSiteEntity("yahoo", "search engine", "Jerry Yang", 1994, "www.yahoo.com"));
		list.add(new WebSiteEntity("gmail", "digital message exchange", "Paul Buchheit", 2001,"www.gmail.com"));
		list.add(new WebSiteEntity("rediff", "web portal", "Ajit Balakrishnan", 1996, "www.rediff.com"));
		list.add(new WebSiteEntity("india Times","newspaper", "angad bhatia", 1994, "www.indiatimes.com"));
		list.add(new WebSiteEntity("Timeas Of India", "newspaper", "Ramkrishna Dalmia",1978 ,"www.timesofindia.com"));
		list.add(new WebSiteEntity("telegram", "web appliction", "Nikolai and Pavel Durov", 2013,"www.telegram.org"));
		list.add(new WebSiteEntity("99Acers", "web portal", "Sanjeev Bikhchandani", 2005, "www.99acers.com"));
		list.add(new WebSiteEntity("pinterest", "social media service", " Ben Silbermann", 2009, "www.pinterest.com"));
		list.add(new WebSiteEntity("flipkart", "e-commerece", "sachin bansal", 2007, "www.flipkart.com"));
		list.add(new WebSiteEntity("amazone", "e-commerece", "Jeff Bezos", 1994, "www.amazone.com"));
		list.add(new WebSiteEntity("netflix", "entertainment", "Reed Hastings", 1997, "www.netflix.com"));
		list.add(new WebSiteEntity("wikipedia", "content", "Jimmy Wales", 2000, "www.wiwkipedida.com"));
		list.add(new WebSiteEntity("skype", "software", "Niklas Zennstrom", 2003, "www.skype.com"));
		list.add(new WebSiteEntity("disney", "entertainment", "walt disney", 1923, "www.disney.com"));
		WebsiteDAO websiteDAO= new WebSiteDAOImpl();
		websiteDAO.save(list);
	}

}
