package com.sdn02.objetosgasto.models.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_grupo_gasto")
public class GrupoGastoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idGrupoGasto;

	@Column(name = "nombre_grupo_gasto", length = 150)
	private String nombreGrupoGasto;

	@Column(name = "es_activo", columnDefinition = "boolean default true")
	private Boolean esActivo;

	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;

	@Column(name = "update_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateAt;

	@OneToMany(fetch = FetchType.LAZY)
	private List<ObjetoGastoModel> objetoGastoModels;

	@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}

	public GrupoGastoModel() {
		this.objetoGastoModels = new ArrayList<>();
	}

	public Long getIdGrupoGasto() {
		return idGrupoGasto;
	}

	public void setIdGrupoGasto(Long idGrupoGasto) {
		this.idGrupoGasto = idGrupoGasto;
	}

	public String getNombreGrupoGasto() {
		return nombreGrupoGasto;
	}

	public void setNombreGrupoGasto(String nombreGrupoGasto) {
		this.nombreGrupoGasto = nombreGrupoGasto;
	}

	public Boolean getEsActivo() {
		return esActivo;
	}

	public void setEsActivo(Boolean esActivo) {
		this.esActivo = esActivo;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public List<ObjetoGastoModel> getObjetoGastoModels() {
		return objetoGastoModels;
	}

	public void setObjetoGastoModels(List<ObjetoGastoModel> objetoGastoModels) {
		this.objetoGastoModels = objetoGastoModels;
	}

	public void addObjetoGastoModel(ObjetoGastoModel objetoGastoModel) {
		this.objetoGastoModels.add(objetoGastoModel);
	}

	public void removeObjetoGastoModel(ObjetoGastoModel objetoGastoModel) {
		this.objetoGastoModels.remove(objetoGastoModel);
	}
}
