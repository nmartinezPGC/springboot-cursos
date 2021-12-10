package com.sdn02.objetosgasto.services;

import org.springframework.stereotype.Service;

import com.sdn02.commons.services.CommonServiceImpl;
import com.sdn02.objetosgasto.models.entity.GrupoGastoModel;
import com.sdn02.objetosgasto.repository.GrupoGastoRepository;

@Service
public class GrupoGastoServiceImpl extends CommonServiceImpl<GrupoGastoModel, GrupoGastoRepository>
		implements GrupoGastoService {
	// Code Here
}
