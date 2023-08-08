package com.example.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CategoryDTO;
import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;

import jakarta.validation.Valid;

@RestController
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
    private ModelMapper modelMapper;
	
	@GetMapping("/categories")
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	@PostMapping("/categories")
	@Transactional
	public void addCategory(@RequestBody @Valid CategoryDTO categoryDTO) {
		System.out.println("Category: x" + categoryDTO.getName());
		System.out.println("ProductList: x" + categoryDTO.getProducts().size());
		Category category = modelMapper.map(categoryDTO, Category.class);
		
		category = categoryRepository.save(category);
		
		//to keep productRepository not null
		List<Product> list = category.getProducts();
		for(Product product : list) {
			product.setCategory(category);
		}
		productRepository.saveAll(list);
	}
	
}
