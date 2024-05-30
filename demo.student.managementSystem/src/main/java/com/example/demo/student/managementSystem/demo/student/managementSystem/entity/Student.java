package com.example.demo.student.managementSystem.demo.student.managementSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
	private int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private int rollnumber;
private String name;
private int age;
private String grade;
private String username;
private String Password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public int getRollnumber() {
	return rollnumber;
}
public void setRollnumber(int rollnumber) {
	this.rollnumber = rollnumber;
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
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}

public Student(int id, int rollnumber, String name, int age, String grade, String username, String password) {
	super();
	this.id = id;
	this.rollnumber = rollnumber;
	this.name = name;
	this.age = age;
	this.grade = grade;
	this.username = username;
	Password = password;
}

@Override
public String toString() {
	return "Student [id=" + id + ", rollnumber=" + rollnumber + ", name=" + name + ", age=" + age + ", grade=" + grade
			+ ", username=" + username + ", Password=" + Password + "]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

}
