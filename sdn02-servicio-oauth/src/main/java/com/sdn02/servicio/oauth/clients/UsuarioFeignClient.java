package com.sdn02.servicio.oauth.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sdn02.commons.usuarios.models.entity.UsuarioModel;

@FeignClient(name = "snd02-servicio-usuarios")
public interface UsuarioFeignClient {

	@GetMapping("/users/{correo}/correo")
	public UsuarioModel findByUsuario(@PathVariable String usuario);
}
