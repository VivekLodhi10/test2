package com.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test2Application {
	int x = 100;
	float f  = 20.1;
	public static void main(String[] args) {
		SpringApplication.run(Test2Application.class, args);
	}

}
