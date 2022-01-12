package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="biscuit_table")
public class BiscuitEntity {
	
		@Id
		@Column (name="b_id")
		private int id;
		@Column (name="b_name")
		private String name;
		@Column (name="b_type")
		private String type;
		@Column (name="b_available")
		private String available;
		@Column (name="b_price")
		private int price;
		@Column (name="b_brand")
		private String active;
		
		

	public BiscuitEntity() {
		// TODO Auto-generated constructor stub
	}
	



	public BiscuitEntity(int id, String name, String type, String available, int price, String active) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.available = available;
		this.price = price;
		this.active = active;
	}




	@Override
	public String toString() {
		return "BiscuitEntity [id=" + id + ", name=" + name + ", type=" + type + ", available=" + available + ", price="
				+ price + ", active=" + active + "]";
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
		BiscuitEntity other = (BiscuitEntity) obj;
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



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getAvailable() {
		return available;
	}



	public void setAvailable(String available) {
		this.available = available;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public String getActive() {
		return active;
	}



	public void setActive(String active) {
		this.active = active;
	}
	

}