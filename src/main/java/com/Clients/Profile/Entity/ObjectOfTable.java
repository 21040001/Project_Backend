package com.Clients.Profile.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="list")
public class ObjectOfTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Name")
	private String name;
	@Column(name="Age")
	private int age;
	@Column(name="Email")
	private String email;
	@Column(name="Location")
	private String location;
	@Column(name="Password")
	private String password;
	
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
