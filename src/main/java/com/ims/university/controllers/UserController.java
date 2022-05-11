package com.ims.university.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/student")
	public String HelloStudents() {
		return "Hello, Class enrollment starts next week!";
	}

}
