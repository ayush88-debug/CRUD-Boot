package com.practice.springBoot.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.springBoot.demo.model.Product;


@Service
public class ProductService {
	
	List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(102, "Laptop", 150000)));
	
	public List<Product> getProducts(){
		return products;
	}

	public Product getProductById(int prodId) {
		return products.stream()
				.filter(p -> p.getProdId() == prodId)
				.findFirst().get();
	}
	
	public String addProduct(Product prod) {
		products.add(prod);
		return "Product added successfully";
	}
	
	public Product updateProduct(Product prod) {
		
		for(Product p: products) {
			if(p.getProdId() == prod.getProdId()) {
				p.setProdId(prod.getProdId());
				p.setProdName(prod.getProdName());
				p.setPrice(prod.getPrice());
				
				return p;
			}
		}
		
		return null;
		
	}
	
	
	public String deleteProduct(Product prod) {
		
		for(int i=0; i<products.size(); i++) {
			if(products.get(i).getProdId() == prod.getProdId()) {
				products.remove(i);
				return "Product successfully deleted";
			}
		}
		
		
		return "Product not found / deleted";
	}
	

}
