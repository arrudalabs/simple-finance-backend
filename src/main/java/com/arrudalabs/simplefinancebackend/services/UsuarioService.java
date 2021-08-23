package com.arrudalabs.simplefinancebackend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arrudalabs.simplefinancebackend.entities.Usuario;
import com.arrudalabs.simplefinancebackend.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario insert(Usuario usuario) throws Exception {
		try {
			Usuario user = usuarioRepository.save(usuario);
			return user;
			
		} catch (Exception e) {
			throw new Exception("Erro ao incluir um Usuário no H2" + e.getMessage());
		}
	}

}
