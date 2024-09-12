package com.example.demo_2.service;

import java.util.List;
import java.util.Optional;

import com.example.demo_2.entity.Proveedor;

public interface ProveedorService {
	Proveedor create(Proveedor p);
	Proveedor update(Proveedor p);
	void delete(Long id);
	Optional<Proveedor> read(Long id);
	List<Proveedor> readAll();
}
