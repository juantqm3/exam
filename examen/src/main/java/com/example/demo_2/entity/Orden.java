package com.example.demo_2.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="ordenes")
public class Orden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="fechaorden")
	@Temporal(TemporalType.DATE)
    private Date fechaorden;
	@Column(name = "fechasolicita")
	@Temporal(TemporalType.DATE)
    private Date fechasolicita;
	@Column(name="estado")
	private char estado;
	
	@ManyToOne
	@JoinColumn(name="tipoorden_id", nullable = false)
	private Tipoorden tipoordenes;
	
	@ManyToOne
	@JoinColumn(name="formapago_id", nullable = false)
	private Formapago formapagos;
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}

	public Orden(Long id, Date fechaorden, Date fechasolicita, char estado, Tipoorden tipoordenes, Formapago formapagos,
			Almacen almacenes, Proveedor proveedores) {
		super();
		this.id = id;
		this.fechaorden = fechaorden;
		this.fechasolicita = fechasolicita;
		this.estado = estado;
		this.tipoordenes = tipoordenes;
		this.formapagos = formapagos;
		this.almacenes = almacenes;
		this.proveedores = proveedores;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaorden() {
		return fechaorden;
	}

	public void setFechaorden(Date fechaorden) {
		this.fechaorden = fechaorden;
	}

	public Date getFechasolicita() {
		return fechasolicita;
	}

	public void setFechasolicita(Date fechasolicita) {
		this.fechasolicita = fechasolicita;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public Tipoorden getTipoordenes() {
		return tipoordenes;
	}

	public void setTipoordenes(Tipoorden tipoordenes) {
		this.tipoordenes = tipoordenes;
	}

	public Formapago getFormapagos() {
		return formapagos;
	}

	public void setFormapagos(Formapago formapagos) {
		this.formapagos = formapagos;
	}

	public Almacen getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(Almacen almacenes) {
		this.almacenes = almacenes;
	}

	public Proveedor getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedor proveedores) {
		this.proveedores = proveedores;
	}

	@ManyToOne
	@JoinColumn(name="almacen_id", nullable = false)
	private Almacen almacenes;
	
	@ManyToOne
	@JoinColumn(name="proveedor_id", nullable = false)
	private Proveedor proveedores;
	
}
