package com.example.demo_2.service;

import java.util.List;
import java.util.Optional;

import com.example.demo_2.entity.Almacen;

public interface AlmacenService {
	Almacen create(Almacen a);
	Almacen update(Almacen a);
	void delete(Long id);
	Optional<Almacen> read(Long id);
	List<Almacen> readAll();
}
