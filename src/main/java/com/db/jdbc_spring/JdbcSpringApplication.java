package com.db.jdbc_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcSpringApplication.class, args);

		System.out.println("Hello World!");
	}

}
