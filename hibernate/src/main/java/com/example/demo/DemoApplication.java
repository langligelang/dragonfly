package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories("com.example.demo.dao")
@EntityScan("com.example.demo.beans")
@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args)  {
		SpringApplication.run(DemoApplication.class, args);
	}
}
