package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="silk_details")
public class SilkManufactureEntity {
	@Id
	@Column (name="silk_id")
	private int id;
	@Column (name="silkcom_name")
	private String companyName;
	@Column (name="silk_location")
	private String location;
	@Column (name="silk_type")
	private String type;
	@Column (name="silk_no_of_empolyee")
	private int noOfEmployee;
	@Column (name="silk_turn_over")
	private double turnOver;
	@Column (name="silk_branch")
	private String branch;
	
	public SilkManufactureEntity() {
		// TODO Auto-generated constructor stub
	}

	public SilkManufactureEntity(int id, String companyName, String location, String type, int noOfEmployee,
			double turnOver, String branch) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.location = location;
		this.type = type;
		this.noOfEmployee = noOfEmployee;
		this.turnOver = turnOver;
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "SilkManufactureEntity [id=" + id + ", companyName=" + companyName + ", location=" + location + ", type="
				+ type + ", noOfEmployee=" + noOfEmployee + ", turnOver=" + turnOver + ", branch=" + branch + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(int noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(double turnOver) {
		this.turnOver = turnOver;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

}
