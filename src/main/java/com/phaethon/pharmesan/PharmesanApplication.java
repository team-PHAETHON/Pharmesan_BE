package com.phaethon.pharmesan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Spring Boot 애플리케이션을 시작하는 주요 어노테이션
// 이 어노테이션은 @Configuration, @EnableAutoConfiguration, @ComponentScan을 포함하며, 
// 자동 설정 및 컴포넌트 검색을 수행하여 애플리케이션을 초기화합니다.

public class PharmesanApplication {
	public static void main(String[] args) {
		// SpringApplication.run() 메서드를 통해 Spring Boot 애플리케이션을 실행
		// PharmesanApplication 클래스를 부트스트랩 클래스로 지정하고, 애플리케이션을 실행시킴
		SpringApplication.run(PharmesanApplication.class, args);
	}
}