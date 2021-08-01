package com.min.www;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "com.min.www")
public class BlogApplication {

	public static void main(String[] args) {
		System.out.println("시작");
		SpringApplication.run(BlogApplication.class, args);
	}

}
