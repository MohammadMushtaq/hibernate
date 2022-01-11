package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tourist_table")
public class TouristPlaceEntity {
	@Id
	@Column (name ="t_id")
	private int id;
	@Column (name ="t_name")
	private String name;
	@Column (name ="t_location")
	private String location;
	@Column (name ="t_sea_level")
	private double seaLevel;
	@Column (name ="t_Famous_for")
	private String famousFor;
	@Column (name ="t_season")
	private String season;

	public TouristPlaceEntity() {
		// TODO Auto-generated constructor stub
	}
	

	public TouristPlaceEntity(int id, String name, String location, double seaLevel, String famousFor, String season) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.seaLevel = seaLevel;
		this.famousFor = famousFor;
		this.season = season;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TouristPlaceEntity other = (TouristPlaceEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "TouristPlaceEntity [id=" + id + ", name=" + name + ", location=" + location + ", seaLevel=" + seaLevel
				+ ", famousFor=" + famousFor + ", season=" + season + "]";
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(double seaLevel) {
		this.seaLevel = seaLevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
}
