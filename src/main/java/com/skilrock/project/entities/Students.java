package com.skilrock.project.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Students {
    @Id
	private long id;
	private String name;
	private String number;
	public Students(long id, String name, String number) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
	}
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", number=" + number + "]";
	}
	
}
