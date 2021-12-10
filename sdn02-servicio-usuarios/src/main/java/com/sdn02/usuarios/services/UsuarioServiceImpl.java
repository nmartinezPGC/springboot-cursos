package com.sdn02.usuarios.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdn02.commons.services.CommonServiceImpl;
import com.sdn02.commons.usuarios.models.entity.UsuarioModel;
import com.sdn02.usuarios.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl extends CommonServiceImpl<UsuarioModel, UsuarioRepository> implements UsuarioService {
	// Code Here
	@Autowired
	UsuarioRepository repository;

	@Override
	public Optional<UsuarioModel> findByUsuario(String usuario) {
		return repository.findByUsuario(usuario);
	}

	@Override
	public Optional<UsuarioModel> findByCorreo(String correo) {
		return repository.findByCorreo(correo);
	}
}
