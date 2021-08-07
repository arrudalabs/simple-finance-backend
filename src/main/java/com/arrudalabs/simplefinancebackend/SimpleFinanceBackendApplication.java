package com.arrudalabs.simplefinancebackend;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.springdoc.core.SpringDocConfigProperties;
import org.springdoc.core.SpringDocConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@CrossOrigin("*")
class HelloController {

	@GetMapping("/hello")
	@CrossOrigin("*")
	public ResponseEntity<?> hello(
		@RequestParam("quem") String param){
		return ResponseEntity.ok(Map.of("message", "Olá " + param));
	}

	@PostMapping("/login")
	@CrossOrigin("*")
	public ResponseEntity<?> login(
		@RequestBody JsonNode jsonNode
		){

		if("user@user.com.br".equals(jsonNode.get("email").asText())){
			return ResponseEntity.ok(Map.of("token", UUID.randomUUID().toString()));
		}

		return ResponseEntity.status(HttpStatus.FORBIDDEN)
			.body(Map.of("mensagens", List.of("Credenciais inválidas")));

	}
}