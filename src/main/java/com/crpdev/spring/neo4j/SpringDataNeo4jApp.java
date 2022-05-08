package com.crpdev.spring.neo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.crpdev.spring.neo4j.controller", "com.crpdev.spring.neo4j.service"})
@EntityScan("com.crpdev.spring.neo4j.entity")
public class SpringDataNeo4jApp {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataNeo4jApp.class, args);
	}

}
