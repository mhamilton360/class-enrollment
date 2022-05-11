package com.ims.university;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.java.Log;

@Log
@SpringBootApplication
public class ClassEnrollmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClassEnrollmentApplication.class, args);
		log.info("ClassEnrollmentApplication up!");
	}

}
