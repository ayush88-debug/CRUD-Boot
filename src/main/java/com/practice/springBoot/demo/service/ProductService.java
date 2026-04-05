package com.practice.springBoot.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.springBoot.demo.model.Product;
import com.practice.springBoot.demo.repo.ProductRepo;


@Service
public class ProductService {
	
	@Autowired
	ProductRepo repo;
	
	public List<Product> getProducts(){
		return repo.findAll();
	}

	public Product getProductById(Integer prodId) {
		return repo.findById(prodId).orElse(new Product());
	}
	
	public String addProduct(Product prod) {
		repo.save(prod);
		return "Product added successfully";
	}
	
	public Product updateProduct(Product prod) {
		
		repo.save(prod);
		
		return prod;
		
	}
	
	
	public String deleteProduct(Product prod) {
		
		repo.delete(prod);
		
		
		return "Product deleted";
	}
	

}
