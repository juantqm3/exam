package com.example.demo_2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_2.entity.Almacen;
import com.example.demo_2.repository.AlmacenRepository;
import com.example.demo_2.service.AlmacenService;

@Service
public class AlmacenServiceImpl implements AlmacenService {
	
	@Autowired
	private AlmacenRepository almacenRepository;
	@Override
	public Almacen create(Almacen a) {
		// TODO Auto-generated method stub
		return almacenRepository.save(a);
	}

	@Override
	public Almacen update(Almacen a) {
		// TODO Auto-generated method stub
		return almacenRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		almacenRepository.deleteById(id);
	}

	@Override
	public Optional<Almacen> read(Long id) {
		// TODO Auto-generated method stub
		return almacenRepository.findById(id);
	}

	@Override
	public List<Almacen> readAll() {
		// TODO Auto-generated method stub
		return almacenRepository.findAll();
	}

}
