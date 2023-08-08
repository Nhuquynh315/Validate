package com.example.demo.dto;

import java.util.List;

import com.example.demo.model.Category;
import com.example.demo.model.Product;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CategoryDTO {
	@NotNull(message = "Category should not be null")
	@Size(min = 1, max = 15, message = "Name should contain 1 to 15 characters")
	String name;
	
	@Valid
	List<ProductDTO> products;
	
	public CategoryDTO() {
		// TODO Auto-generated constructor stub
	}

	public CategoryDTO(String name, List<ProductDTO> products) {
		super();
		this.name = name;
		this.products = products;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductDTO> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDTO> products) {
		this.products = products;
	}
	
	
	
}
