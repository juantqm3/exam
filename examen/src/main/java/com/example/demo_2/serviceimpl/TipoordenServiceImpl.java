package com.example.demo_2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_2.entity.Tipoorden;
import com.example.demo_2.repository.TipoordenRepository;
import com.example.demo_2.service.TipoordenService;

@Service
public class TipoordenServiceImpl implements TipoordenService {

	

	@Autowired
	private TipoordenRepository tipoordenRepository;
	@Override
	public Tipoorden create(Tipoorden t) {
		// TODO Auto-generated method stub
		return tipoordenRepository.save(t);
	}

	@Override
	public Tipoorden update(Tipoorden t) {
		// TODO Auto-generated method stub
		return tipoordenRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		tipoordenRepository.deleteById(id);
	}

	@Override
	public Optional<Tipoorden> read(Long id) {
		// TODO Auto-generated method stub
		return tipoordenRepository.findById(id);
	}

	@Override
	public List<Tipoorden> readAll() {
		// TODO Auto-generated method stub
		return tipoordenRepository.findAll();
	}

}
