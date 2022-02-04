package com.Ait;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {
	@Id
	private int vid;
	private String vehiclename;
	public Vehicle() {}
	public Vehicle(int vid, String vname) {
		super();
		this.vid = vid;
		this.vehiclename = vname;
	}

	
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVehicleName() {
		return vehiclename;
	}

	public void setPrice(String vname) {
		this.vehiclename = vname;
	}
	
	

}
