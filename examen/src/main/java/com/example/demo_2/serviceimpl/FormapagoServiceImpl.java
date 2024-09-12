package com.example.demo_2.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo_2.entity.Formapago;
import com.example.demo_2.repository.FormapagoRepository;
import com.example.demo_2.service.FormapagoService;

@Service
public class FormapagoServiceImpl implements FormapagoService {

	@Autowired
	private FormapagoRepository formapagoRepository;
	@Override
	public Formapago create(Formapago f) {
		// TODO Auto-generated method stub
		return formapagoRepository.save(f);
	}

	@Override
	public Formapago update(Formapago f) {
		// TODO Auto-generated method stub
		return formapagoRepository.save(f);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		formapagoRepository.deleteById(id);
	}

	@Override
	public Optional<Formapago> read(Long id) {
		// TODO Auto-generated method stub
		return formapagoRepository.findById(id);
		
	}

	@Override
	public List<Formapago> readAll() {
		// TODO Auto-generated method stub
		return formapagoRepository.findAll();
	}

}
