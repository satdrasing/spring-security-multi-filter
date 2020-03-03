package com.example.demo.controller;

import java.util.Arrays;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private Environment environment;

	@GetMapping("test")
	public Collection<String> getAllNames(){

		System.out.println(environment);
		return Arrays.asList("satendra","move","coding");
	}
}
