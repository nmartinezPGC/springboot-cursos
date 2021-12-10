package com.sdn02.usuarios.controllers;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sdn02.commons.controllers.CommonController;
import com.sdn02.commons.usuarios.models.entity.UsuarioModel;
import com.sdn02.usuarios.services.UsuarioService;

@RestController
public class UsuarioController extends CommonController<UsuarioModel, UsuarioService> {
	@PutMapping("{id}")
	public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody UsuarioModel usuario) {
		Optional<UsuarioModel> optUserOptional = service.findById(id);

		if (optUserOptional.isEmpty()) {
			return ResponseEntity.notFound().build();
		}

		UsuarioModel usuarioDB = optUserOptional.get();
		usuarioDB.setUsuario(usuario.getUsuario());
		usuarioDB.setContrasena(usuario.getContrasena());
		usuarioDB.setPrimerNombre(usuario.getPrimerNombre());
		usuarioDB.setSegundoNombre(usuario.getSegundoNombre());
		usuarioDB.setPrimerApellido(usuario.getPrimerApellido());
		usuarioDB.setSegundoApellido(usuario.getSegundoApellido());
		usuarioDB.setCorreo(usuario.getCorreo());

		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(usuarioDB));
	}

	@GetMapping("/{usuario}/detail")
	public ResponseEntity<?> getUserByName(@PathVariable String usuario) {
		Optional<UsuarioModel> optUserByName = service.findByUsuario(usuario);
		return ResponseEntity.ok().body(optUserByName.get());
	}

	@GetMapping("/{correo}/correo")
	public ResponseEntity<?> getUserByCorreo(@PathVariable String correo) {
		Optional<UsuarioModel> optUserByCorreo = service.findByCorreo(correo);
		return ResponseEntity.ok().body(optUserByCorreo.get());
	}
}
