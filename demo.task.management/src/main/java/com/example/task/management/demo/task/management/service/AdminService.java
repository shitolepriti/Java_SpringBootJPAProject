package com.example.task.management.demo.task.management.service;

import java.util.List;

import com.example.task.management.demo.task.management.entity.Admin;



public interface AdminService {

	public Admin saveStudent(Admin admin);
	public List<Admin>adminList();
	public void deleteById(int id);
	public Admin findById(int id);
	public Admin updateAdmin(Admin admin);
	
}
