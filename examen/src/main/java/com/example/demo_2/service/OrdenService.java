package com.example.demo_2.service;

import java.util.List;
import java.util.Optional;

import com.example.demo_2.entity.Orden;

public interface OrdenService {
	Orden create(Orden o);
	Orden update(Orden o);
	void delete(Long id);
	Optional<Orden> read(Long id);
	List<Orden> readAll();
}
