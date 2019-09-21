package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TestApplication.class, args);

		
		  Computer a = context.getBean(Computer.class);
		  
		  a.show();
		/*
		 * Computer a1 = context.getBean(Computer.class);
		 * 
		 * a1.show();
		 */
		 
	}

}
