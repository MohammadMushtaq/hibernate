package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="airport_table")
public class AirportEntity {	
		@Id
		@Column (name="a_id")
		private int id;
		@Column (name="a_name")
		private String name;
		@Column (name="a_type")
		private String type;
		@Column (name="a_location")
		private String location;
		@Column (name="a_source")
		private String source;
		@Column (name="a_destination")
		private String destination;
		@Column (name="a_active")
		private boolean active;

		public AirportEntity() {
			// TODO Auto-generated constructor stub
		}

		public AirportEntity(int id, String name, String type, String location, String source, String destination,
				boolean active) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.location = location;
			this.source = source;
			this.destination = destination;
			this.active = active;
		}

		@Override
		public String toString() {
			return "AirportEntity [id=" + id + ", name=" + name + ", type=" + type + ", location=" + location
					+ ", noOfEmployee=" + source + ", destination=" + destination + ", active=" + active + "]";
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
			AirportEntity other = (AirportEntity) obj;
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

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getSource() {
			return source;
		}

		public void setNoOfEmployee(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}
		
		
}



