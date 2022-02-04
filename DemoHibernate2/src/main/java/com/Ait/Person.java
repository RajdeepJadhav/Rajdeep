package com.Ait;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
		@Id
		private int aadharno;
		private String name;
		
		@OneToOne
		private Vehicle vehicle;
	
		public Person() {}
		
		public Person(int aadharno, String name, Vehicle vehicle) {
			super();
			this.aadharno = aadharno;
			this.name = name;
			this.vehicle = vehicle;
		}
		public int getAadharno() {
			return aadharno;
		}
		public void setAadharno(int aadharno) {
			this.aadharno = aadharno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Vehicle getVehicle() {
			return vehicle;
		}
		public void setVehicle(Vehicle vehicle) {
			this.vehicle = vehicle;
		}
		
		
		
		
}
