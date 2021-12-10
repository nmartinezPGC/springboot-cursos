package com.sdn02.usuarios.services;

import java.util.Optional;

import com.sdn02.commons.services.CommonService;
import com.sdn02.commons.usuarios.models.entity.UsuarioModel;

public interface UsuarioService extends CommonService<UsuarioModel>  {
	// Load code extends
	public Optional<UsuarioModel> findByUsuario(String usuario);
	
	public Optional<UsuarioModel> findByCorreo(String correo);
}
