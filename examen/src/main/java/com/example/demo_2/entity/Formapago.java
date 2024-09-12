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
@Table(name="formapagos")
public class Formapago {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="nombrespago")
	private String nombrespago;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy = "formapagos")
	@JsonIgnore
	private Set<Orden> ordenes;

	
	
	public Formapago() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formapago(Long id, String nombrespago, Set<Orden> ordenes) {
		super();
		this.id = id;
		this.nombrespago = nombrespago;
		this.ordenes = ordenes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombrespago() {
		return nombrespago;
	}

	public void setNombrespago(String nombrespago) {
		this.nombrespago = nombrespago;
	}

	public Set<Orden> getOrdenes() {
		return ordenes;
	}

	public void setOrdenes(Set<Orden> ordenes) {
		this.ordenes = ordenes;
	}
	
	
}
