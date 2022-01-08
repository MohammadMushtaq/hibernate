package com.xworkz.patient.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="patient_details")
public class PatientEntity {
	@Id
	@Column (name="p_id")
	private int id;
	@Column (name="p_name")
	private String name;
	@Column (name="p_birth_place")
	private String birthPlace;
	@Column (name="p_corona")
	private String corona;
	@Column (name="p_age")
	private float age;
	@Column (name="p_bu_no")
	private int busNo;
	
	public PatientEntity() {
		// TODO Auto-generated constructor stub
	}

	public PatientEntity(int id, String name, String birthPlace, String corona, float age, int busNo) {
		super();
		this.id = id;
		this.name = name;
		this.birthPlace = birthPlace;
		this.corona = corona;
		this.age = age;
		this.busNo = busNo;
	}

	@Override
	public String toString() {
		return "PatientDAO [id=" + id + ", name=" + name + ", birthPlace=" + birthPlace + ", corona=" + corona
				+ ", age=" + age + ", busNo=" + busNo + "]";
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
		PatientEntity other = (PatientEntity) obj;
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

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String isCorona() {
		return corona;
	}

	public void setCorona(String corona) {
		this.corona = corona;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	

}
