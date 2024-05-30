package com.example.task.management.demo.task.management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
private int id;
private String name;
private String password;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Admin [id=" + id + ", name=" + name + ", password=" + password + "]";
}
public Admin(int id, String name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
}
public Admin() {
	super();
	// TODO Auto-generated constructor stub
}


}
