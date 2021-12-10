package com.sdn02.objetosgasto.repository;

import org.springframework.data.repository.CrudRepository;

import com.sdn02.objetosgasto.models.entity.GrupoGastoModel;

public interface GrupoGastoRepository extends CrudRepository<GrupoGastoModel, Long> {
}
