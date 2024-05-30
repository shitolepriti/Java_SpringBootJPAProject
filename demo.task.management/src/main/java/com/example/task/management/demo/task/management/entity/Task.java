package com.example.task.management.demo.task.management.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO.SEQUENCE)
private int id;
private String taskdescription;
private Date dueDate;
private String status;

private String title;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getTaskdescription() {
	return taskdescription;
}

public void setTaskdescription(String taskdescription) {
	this.taskdescription = taskdescription;
}

public Date getDueDate() {
	return dueDate;
}

public void setDueDate(Date dueDate) {
	this.dueDate = dueDate;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

@Override
public String toString() {
	return "Task [id=" + id + ", taskdescription=" + taskdescription + ", dueDate=" + dueDate + ", status=" + status
			+ ", title=" + title + "]";
}

public Task(int id, String taskdescription, Date dueDate, String status, String title) {
	super();
	this.id = id;
	this.taskdescription = taskdescription;
	this.dueDate = dueDate;
	this.status = status;
	this.title = title;
}

public Task() {
	super();
	// TODO Auto-generated constructor stub
}


}
