package com.tka.DataBaseDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.tka")
public class DataBaseDemoApplication {

	public static void main(String[] args) {
		
	SpringApplication.run(DataBaseDemoApplication.class, args);
	System.out.println("Application Started...");
	}

}
