package com.example.demo_2.service;

import java.util.List;
import java.util.Optional;

import com.example.demo_2.entity.Tipoorden;

public interface TipoordenService {
	Tipoorden create(Tipoorden t);
	Tipoorden update(Tipoorden t);
	void delete(Long id);
	Optional<Tipoorden> read(Long id);
	List<Tipoorden> readAll();
}
