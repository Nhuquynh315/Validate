package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Category;
import com.example.demo.model.Product;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{


}

