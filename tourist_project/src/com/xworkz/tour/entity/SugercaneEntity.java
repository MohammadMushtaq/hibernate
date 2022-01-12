package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="sugercane_factory")
public class SugercaneEntity {
	@Id
	@Column (name="s_id")
	private int id;
	@Column (name="s_name")
	private String name;
	@Column (name="s_location")
	private String location;
	@Column (name="s_no_of_employee")
	private String noOfEmployee;
	@Column (name="s_active")
	private boolean active;
	@Column (name="s_type")
	private String type;
	
	public SugercaneEntity() {
		// TODO Auto-generated constructor stub
	}

	public SugercaneEntity(int id, String name, String location, String noOfEmployee, boolean active, String type) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOfEmployee = noOfEmployee;
		this.active = active;
		this.type = type;
	}

	@Override
	public String toString() {
		return "SugercaneEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfEmployee="
				+ noOfEmployee + ", active=" + active + ", type=" + type + "]";
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
		SugercaneEntity other = (SugercaneEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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

	public String getNoOfEmployee() {
		return noOfEmployee;
	}

	public void setNoOfEmployee(String noOfEmployee) {
		this.noOfEmployee = noOfEmployee;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

}
