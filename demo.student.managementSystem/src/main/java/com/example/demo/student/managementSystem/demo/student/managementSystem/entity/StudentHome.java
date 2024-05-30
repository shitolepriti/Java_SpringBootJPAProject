package com.example.demo.student.managementSystem.demo.student.managementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class StudentHome {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int rollnumber;
	private String username;
	private String password;
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public String getUsername() {
		return username;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public StudentHome(int id, int rollnumber, String username, String password) {
		super();
		this.id = id;
		this.rollnumber = rollnumber;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentHome [id=" + id + ", rollnumber=" + rollnumber + ", username=" + username + ", password="
				+ password + "]";
	}
	public StudentHome() {
		super();
		// TODO Auto-generated constructor stub
	}

}
