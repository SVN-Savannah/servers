package com.savannah.servers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ServersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServersApplication.class, args);
	}

}
