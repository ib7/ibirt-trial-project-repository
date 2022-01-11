package com.birt.undark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories
@SpringBootApplication
public class PhoneProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneProjectApplication.class, args);
	}

}
