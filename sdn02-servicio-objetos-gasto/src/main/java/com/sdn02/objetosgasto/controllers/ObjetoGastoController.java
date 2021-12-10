package com.sdn02.objetosgasto.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.sdn02.commons.controllers.CommonController;
import com.sdn02.objetosgasto.models.entity.ObjetoGastoModel;
import com.sdn02.objetosgasto.services.ObjetoGastoService;

@Controller
public class ObjetoGastoController extends CommonController<ObjetoGastoModel, ObjetoGastoService> {
	// Code Here
	@PutMapping("{id}")
	public ResponseEntity<?> updateObjetoGasto(@RequestBody ObjetoGastoModel objetoGasto, @PathVariable Long id) {
		Optional<ObjetoGastoModel> optObjetoGasto = this.service.findById(id);
		if (!optObjetoGasto.isPresent()) {
			return ResponseEntity.notFound().build();
		}

		ObjetoGastoModel objetoGastoDB = optObjetoGasto.get();
		objetoGastoDB.setNombreObjetoGasto(objetoGasto.getNombreObjetoGasto());

		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.save(objetoGastoDB));
	}
}
