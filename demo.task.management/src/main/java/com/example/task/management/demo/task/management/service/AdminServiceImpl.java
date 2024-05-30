package com.example.task.management.demo.task.management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.task.management.demo.task.management.entity.Admin;
import com.example.task.management.demo.task.management.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminRepository adminRepository;
	

	public AdminServiceImpl(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public Admin saveStudent(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

	@Override
	public List<Admin> adminList() {
		// TODO Auto-generated method stub
		List<Admin>findAll=adminRepository.findAll();
		return findAll;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		adminRepository.deleteById(id);
	}

	@Override
	public Admin findById(int id) {
		
		// TODO Auto-generated method stub
		Optional<Admin>findById=adminRepository.findById(id);
		Admin admin=findById.get();
		
		return admin;
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepository.save(admin);
	}

}
