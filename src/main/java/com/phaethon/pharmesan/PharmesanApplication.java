package com.phaethon.pharmesan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.phaethon.pharmesan.Repository.MongoDB")
@EnableMongoRepositories(basePackages = "com.phaethon.pharmesan.Repository.SQLite")
public class PharmesanApplication {
	public static void main(String[] args) {
		SpringApplication.run(PharmesanApplication.class, args);
	}
}
