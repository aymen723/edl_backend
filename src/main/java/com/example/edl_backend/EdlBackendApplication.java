package com.example.edl_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EdlBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdlBackendApplication.class, args);

	}

}
