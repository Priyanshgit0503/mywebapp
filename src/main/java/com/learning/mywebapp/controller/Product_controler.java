package com.learning.mywebapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.mywebapp.model.Product;
import com.learning.mywebapp.service.ProdService;
@RestController
public class Product_controler {
	@Autowired
	ProdService service;
	@RequestMapping("/products")
	public List <Product> getProducts() {
		return service.getProducts(); 
	}
}
