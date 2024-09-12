package com.example.demo_2.service;

import java.util.List;
import java.util.Optional;

import com.example.demo_2.entity.Formapago;

public interface FormapagoService {
	Formapago create(Formapago f);
	Formapago update(Formapago f);
	void delete(Long id);
	Optional<Formapago> read(Long id);
	List<Formapago> readAll();
}
