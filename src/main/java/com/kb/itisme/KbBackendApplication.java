package com.kb.itisme;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class KbBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(KbBackendApplication.class, args);
	}

}
