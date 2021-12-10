package com.sdn02.objetosgasto.services;

import org.springframework.stereotype.Service;
import com.sdn02.commons.services.CommonServiceImpl;
import com.sdn02.objetosgasto.models.entity.ObjetoGastoModel;
import com.sdn02.objetosgasto.repository.ObjetoGastoRepository;

@Service
public class ObjetoGastoServiceImpl extends CommonServiceImpl<ObjetoGastoModel, ObjetoGastoRepository>
		implements ObjetoGastoService {
	// Code Here
}
