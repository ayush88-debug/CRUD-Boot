package com.practice.springBoot.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.springBoot.demo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
