package com.example.demo_2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo_2.entity.Formapago;
import com.example.demo_2.service.FormapagoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/formapagos")
public class FormapagoController {
	@Autowired
	private FormapagoService formapagoService;
	
	@GetMapping
	public ResponseEntity<List<Formapago>> readAll(){
		try {
			List<Formapago> Formapagos = formapagoService.readAll();
			if(Formapagos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Formapagos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Formapago> crear(@Valid @RequestBody Formapago cat){
		try {
			Formapago f = formapagoService.create(cat);
			return new ResponseEntity<>(f, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Formapago> getFormapagoId(@PathVariable("id") Long id){
		try {
			Formapago f = formapagoService.read(id).get();
			return new ResponseEntity<>(f, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Formapago> delFormapago(@PathVariable("id") Long id){
		try {
			formapagoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateFormapago(@PathVariable("id") Long id, @Valid @RequestBody Formapago cat){

			Optional<Formapago> f = formapagoService.read(id);
			if(!f.isEmpty()) {
				return new ResponseEntity<>(formapagoService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
