package br.com.springboot.springbootpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringbootPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPatternsApplication.class, args);
	}

}
