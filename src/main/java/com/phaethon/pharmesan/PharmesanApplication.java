package com.phaethon.pharmesan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.phaethon.pharmesan.Repository.SQLite")  // 리포지토리 경로
public class PharmesanApplication {
	public static void main(String[] args) {
		SpringApplication.run(PharmesanApplication.class, args);
	}
}
