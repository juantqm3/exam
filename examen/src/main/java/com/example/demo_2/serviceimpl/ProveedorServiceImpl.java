package com.example.demo_2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_2.entity.Proveedor;
import com.example.demo_2.repository.ProveedorRepository;
import com.example.demo_2.service.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService {
	
	@Autowired
	private ProveedorRepository proveedorRepository;

	@Override
	public Proveedor create(Proveedor p) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(p);
	}

	@Override
	public Proveedor update(Proveedor p) {
		// TODO Auto-generated method stub
		return proveedorRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		proveedorRepository.deleteById(id);
	}

	@Override
	public Optional<Proveedor> read(Long id) {
		// TODO Auto-generated method stub
		return proveedorRepository.findById(id);
	}

	@Override
	public List<Proveedor> readAll() {
		// TODO Auto-generated method stub
		return proveedorRepository.findAll();
	}


}
