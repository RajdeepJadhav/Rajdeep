package com.Session;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="stud") 
public class Student2 {
	@Id
	@GeneratedValue //for auto-incrementing
	private int id;
	@Column(name="studentname" ,nullable = false)//specify column name and for no null values allowed
	private String name;
	@Column(name="percentage",nullable = true,length=45)//specify column name and for  null values allowed
	private int percent;
	
	@Transient
	private String hobby;
	public Student2() {}
	public Student2(int id, String name, int percent) {
		this.id = id;
		this.name = name;
		this.percent = percent;
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
	public int getPercent() {
		return percent;
	}
	public void setPercent(int percent) {
		this.percent = percent;
	}
	
}
