package com.inspark.starter;

import org.springframework.boot.SpringApplication;

public class TestSpringBootInsparkStarterApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootInsparkStarterApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
