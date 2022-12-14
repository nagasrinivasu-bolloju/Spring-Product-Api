package com.example.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.Spring")
public class Application {

	public static void main(String[] args)
	{
		System.out.println("ready to start!!!");
		SpringApplication.run(Application.class, args);
		System.out.println("Running spring Application!!!");
	}

}
