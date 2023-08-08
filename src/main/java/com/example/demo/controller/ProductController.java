package com.example.demo.controller;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@RestController
public class ProductController {
	@GetMapping("/product/name")
	public String getProductName() {
		return "TEST PRODUCT";
	}
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
			return productRepository.findAll();
		}
	
	@PostMapping("/products")
	public void addProduct(@RequestBody Product product) {
		System.out.println(product.toString());
	}
	@GetMapping("/product")
	public void getIdAddName(@RequestParam int id, @RequestParam String name) {
		System.out.println(id + " - " + name);
	}
	
	@GetMapping("/products/{id}")
	public Product getIdFromPath(@PathVariable int id) {
		return productRepository.findById(id).get();
	}
	
}

