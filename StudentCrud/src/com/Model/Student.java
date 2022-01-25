package com.Model;

import java.sql.Date;

public class Student {
	
	private int id;
	private String name;
	private int percentage;
	private Date birthdate;
	private String city;
	
	//public Student(String name2, int per, java.util.Date bd, String city2){}
	public Student(){}
	public Student(String name, int percentage, Date birthdate, String city) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.birthdate = birthdate;
		this.city = city;
	}

	public Student(int id, String name, int percentage, Date birthdate, String city) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.birthdate = birthdate;
		this.city = city;
	}
	
	public Student(int id2, int pr) {
		this.id=id2;
		this.percentage=pr;
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + ", birthdate=" + birthdate
				+ ", city=" + city + "]";
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

	public int getPercentage() {
		return percentage;
	}

	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
