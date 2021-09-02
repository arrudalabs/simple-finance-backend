package com.arrudalabs.simplefinancebackend.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arrudalabs.simplefinancebackend.dto.NewRegistrationDTO;
import com.arrudalabs.simplefinancebackend.entities.Usuario;
import com.arrudalabs.simplefinancebackend.repositories.UsuarioRepository;

@RestController
@RequestMapping("/api/registration")
public class RegistrationResource {
	
	private final UsuarioRepository usuarioRepository;

	public RegistrationResource(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}
	
	public ResponseEntity<Usuario> newRegistration(NewRegistrationDTO registration){
		
	}

}
