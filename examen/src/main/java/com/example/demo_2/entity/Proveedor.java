package com.example.demo_2.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name="proveedores")
public class Proveedor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="ruc")
	private String ruc;
	@Column(name="razonsocial")
	private String razonsocial;
	@Column(name="contacto")
	private String contacto;
	@Column(name="telefono")
	private String telefono;
	@Column(name="estado")
	private char estado;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "proveedores")
	@JsonIgnore
	private Set<Orden> ordenes;

	
	
	public Proveedor() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public Set<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(Set<Orden> ordenes) {
		this.ordenes = ordenes;
	}

	public Proveedor(Long id, String ruc, String razonsocial, String contacto, String telefono, char estado,
			Set<Orden> ordenes) {
		super();
		this.id = id;
		this.ruc = ruc;
		this.razonsocial = razonsocial;
		this.contacto = contacto;
		this.telefono = telefono;
		this.estado = estado;
		this.ordenes = ordenes;
	}
	
	
	
}
