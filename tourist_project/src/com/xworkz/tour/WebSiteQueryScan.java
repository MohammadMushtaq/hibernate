package com.xworkz.tour;

import com.xworkz.tour.dao.WebSiteDAOImpl;
import com.xworkz.tour.dao.WebsiteDAO;
import com.xworkz.tour.entity.WebSiteEntity;

public class WebSiteQueryScan {

	public static void main(String[] args) {
		WebsiteDAO websiteDAO= new WebSiteDAOImpl();
		WebSiteEntity entity= websiteDAO.getByNameGoogle();
		System.out.println(entity);
		
		WebSiteEntity entity1=websiteDAO.getByLikeUrl();
		System.out.println(entity1);
		
		WebSiteEntity entity2= websiteDAO.getMaxBySince();
		System.out.println(entity2);
		
		WebSiteEntity entity3= websiteDAO.getMinBySince();
		System.out.println(entity3);
		
		WebSiteEntity entity4= websiteDAO.getSecondMinSince();
		System.out.println(entity4);
		
		WebSiteEntity entity5= websiteDAO.getSecondMaxBySince();
		System.out.println(entity5);
		
	}

}
