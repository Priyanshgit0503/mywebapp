package com.learning.mywebapp.model;

import org.springframework.stereotype.Component;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//
//@Data
//@AllArgsConstructor
@Component
public class Product {
	private int Pid;
	private String Pname;
	private int Price;
	
	public Product() {
		
	}
	public Product(int pid, String pname, int price) {
		this.Pid = pid;
		this.Pname = pname;
		this.Price = price;
	}
	public int getPid() {
		return Pid;
	}
	public void setPid(int pid) {
		Pid = pid;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
}
