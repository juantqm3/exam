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


import com.example.demo_2.entity.Tipoorden;
import com.example.demo_2.service.TipoordenService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tipoordenes")
public class TipoordenController {
	@Autowired
	private TipoordenService tipoordenService;
	
	@GetMapping
	public ResponseEntity<List<Tipoorden>> readAll(){
		try {
			List<Tipoorden> Tipoordenes = tipoordenService.readAll();
			if(Tipoordenes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Tipoordenes, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Tipoorden> crear(@Valid @RequestBody Tipoorden cat){
		try {
			Tipoorden t = tipoordenService.create(cat);
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Tipoorden> getTipoordenId(@PathVariable("id") Long id){
		try {
			Tipoorden t = tipoordenService.read(id).get();
			return new ResponseEntity<>(t, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Tipoorden> delTipoorden(@PathVariable("id") Long id){
		try {
			tipoordenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTipoorden(@PathVariable("id") Long id, @Valid @RequestBody Tipoorden cat){

			Optional<Tipoorden> t = tipoordenService.read(id);
			if(!t.isEmpty()) {
				return new ResponseEntity<>(tipoordenService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
