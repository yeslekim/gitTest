package com.example.gitTest.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	public String test() {
		String test = "test";
		return test;
	}
}
