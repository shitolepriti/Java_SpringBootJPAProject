package com.example.task.management.demo.task.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.task.management.demo.task.management.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
