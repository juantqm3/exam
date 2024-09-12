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
@Table(name="tipoordenes")
public class Tipoorden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "tipoordenes")
	@JsonIgnore
	private Set<Orden> ordenes;

	
	
	public Tipoorden() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(Set<Orden> ordenes) {
		this.ordenes = ordenes;
	}

	public Tipoorden(Long id, String descripcion, Set<Orden> ordenes) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.ordenes = ordenes;
	}
	
	
	
	
}
