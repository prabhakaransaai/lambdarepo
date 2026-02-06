package com.lamda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lamda")
public class LambdaApplication {

	public static void main(String[] args) {
		System.out.println("Lambda Handler commit");
		SpringApplication.run(LambdaApplication.class, args);
	}

}
