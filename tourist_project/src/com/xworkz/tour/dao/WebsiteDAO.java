package com.xworkz.tour.dao;

import java.util.List;


import com.xworkz.tour.entity.WebSiteEntity;

public interface WebsiteDAO {

	void save(List<WebSiteEntity> webSiteEntity);
	
	 WebSiteEntity  getByNameGoogle();
	 WebSiteEntity getByLikeUrl();
	 WebSiteEntity getMaxBySince();
	 WebSiteEntity getMinBySince();
	 WebSiteEntity getSecondMinSince();
	 WebSiteEntity getSecondMaxBySince();
}
