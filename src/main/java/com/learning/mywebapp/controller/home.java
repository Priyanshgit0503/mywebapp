package com.learning.mywebapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class home {
	
		@RequestMapping("/")
		@ResponseBody
		public String greet(){
	         		System.out.println("hey");
	         		return "this is a try";
		}
		@RequestMapping("/about")
		public String about() {
			return "we dont do that hetre";
		}
		
	}


