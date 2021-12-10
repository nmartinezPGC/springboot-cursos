package com.sdn02.objetosgasto.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tbl_objetos_gasto")
public class ObjetoGastoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idObjetoGasto;

	@Column(name = "nombre_objeto_gasto", length = 150)
	private String nombreObjetoGasto;

	@Column(name = "es_activo", columnDefinition = "boolean default true")
	private Boolean esActivo;

	@Column(name = "create_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;

	@Column(name = "update_at")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateAt;

	@PrePersist
	public void prePersist() {
		this.createAt = new Date();
	}

	public Long getIdObjetoGasto() {
		return idObjetoGasto;
	}

	public void setIdObjetoGasto(Long idObjetoGasto) {
		this.idObjetoGasto = idObjetoGasto;
	}

	public String getNombreObjetoGasto() {
		return nombreObjetoGasto;
	}

	public void setNombreObjetoGasto(String nombreObjetoGasto) {
		this.nombreObjetoGasto = nombreObjetoGasto;
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
}
