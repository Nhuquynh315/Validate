package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.User;

public interface UserRepository1 extends JpaRepository<User, Integer>{
		User findById(int id);
	}

