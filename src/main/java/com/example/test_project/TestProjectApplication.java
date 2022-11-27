package com.example.test_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //annotation - tells the application that it's a springboot application
public class TestProjectApplication {

	public static void main(String[] args) {
		try{
			//spring starter class
			SpringApplication.run(TestProjectApplication.class, args);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
