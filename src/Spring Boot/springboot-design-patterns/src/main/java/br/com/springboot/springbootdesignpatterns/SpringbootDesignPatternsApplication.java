package br.com.springboot.springbootdesignpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootDesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDesignPatternsApplication.class, args);
	}

}
