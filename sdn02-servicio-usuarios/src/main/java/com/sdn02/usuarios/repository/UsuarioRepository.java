package com.sdn02.usuarios.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sdn02.commons.usuarios.models.entity.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
	// Code Here
	public Optional<UsuarioModel> findByUsuario(String usuario);

	public Optional<UsuarioModel> findByCorreo(String correo);
}
