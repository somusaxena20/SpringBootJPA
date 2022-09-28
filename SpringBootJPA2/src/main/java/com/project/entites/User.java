package com.project.entites;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
//NAMED QUERY 
@NamedQuery(name = "User.findBy",query = "SELECT u FROM User u WHERE u.city=?1")
public class User {

	@Id
	private int id;

	private String name;

	private String city;

	private String status;
	

	public User(int id, String name, String city, String status) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
		
		
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
