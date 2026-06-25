package com.rakshith.productmanagement.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import model.Product;

@RestController//handle restfull api response and request automatically converts json
public class ProductController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@GetMapping("/products")
	public List products() {
		return Arrays.asList(
				new Product(1,"Laptop"),
				new Product(2,"Watch"),
				new Product(3,"phone"));
	}
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product product) {
		return product;
		
	}
	
	

}
