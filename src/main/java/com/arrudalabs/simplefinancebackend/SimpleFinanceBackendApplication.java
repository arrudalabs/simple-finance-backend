package com.arrudalabs.simplefinancebackend;

import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SimpleFinanceBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleFinanceBackendApplication.class, args);
	}

}

@RestController
@RequestMapping("/api")
class HelloController {

	@GetMapping("/hello")
	public ResponseEntity<?> hello(
		@RequestParam("quem") String param){
		return ResponseEntity.ok(Map.of("message", "Olá " + param));
	}

}