package com.learning.mywebapp.service;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.mywebapp.model.Product;
@Service
public class ProdService {
	List<Product> products = Arrays.asList(new Product(101,"A",50000), 
			new Product(102,"B",70000),
			new Product(103,"C",80000));
	public List<Product> getProducts(){
		return products;
		
	}
}
