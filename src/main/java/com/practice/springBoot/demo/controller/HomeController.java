package com.practice.springBoot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.springBoot.demo.model.Product;
import com.practice.springBoot.demo.service.ProductService;

@RestController
public class HomeController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return productService.getProductById(prodId);
	}
	
	@PostMapping("/products")
	public String addProduct(@RequestBody Product prod) {
		return productService.addProduct(prod);
	}
	
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product prod) {
		return productService.updateProduct(prod);
	}
	
	@DeleteMapping("/products")
	public String deleteProduct(@RequestBody Product prod) {
		return productService.deleteProduct(prod);
	}
}
