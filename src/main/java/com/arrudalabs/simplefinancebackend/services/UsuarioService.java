package com.arrudalabs.simplefinancebackend.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	public List<Usuario> getAll() throws Exception {
		try {
			List<Usuario> listUser = new ArrayList<>();
			listUser = usuarioRepository.findAll();
			return listUser;
		} catch (Exception e) {
			throw new Exception("Erro ao buscar a lista de Usuários");
		}
	}

	public Usuario findById(Long id) throws Exception {
		
			Optional<Usuario> user = usuarioRepository.findById(id);
			return user.orElseThrow(()-> new Exception("Objeto não Encontrado"));
	}
	
	public Usuario update (Long id, Usuario user) throws Exception {
		try {
			Usuario usuario = usuarioRepository.getById(id);
			usuario.setNome(user.getNome());
			usuario.setEmail(user.getEmail());
			usuario.setSenha(user.getSenha());
			usuario = usuarioRepository.save(usuario);
			return usuario;
		} catch (Exception e) {
			throw new Exception("Erro ao atualizar um usuário");
		}
	}
		
}
