package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProblemsApplication {

	public static int sum(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		SpringApplication.run(ProblemsApplication.class, args);
		
		System.out.println("sum of two number"+sum(1,3));
	}

}
