package com.villazon.apihorariomed;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.villazon.apihorariomed")
public class ApihorariomedApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApihorariomedApplication.class, args);
	}
}
