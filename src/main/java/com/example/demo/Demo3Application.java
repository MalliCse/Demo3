package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {

		System.out.print("Hello");
		System.out.print("Malli");
		System.out.print("Hello");
		System.out.print("John");

		SpringApplication.run(Demo3Application.class, args);
	}

}
