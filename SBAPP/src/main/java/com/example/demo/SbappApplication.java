package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbappApplication.class, args);
		System.out.println("i am from jenkins!!!");
	}

}
