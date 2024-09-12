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
import com.example.demo_2.entity.Almacen;
import com.example.demo_2.service.AlmacenService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/api/almacenes")
public class AlmacenController {
	@Autowired
	private AlmacenService almacenService;
	
	@GetMapping
	public ResponseEntity<List<Almacen>> readAll(){
		try {
			List<Almacen> Almacenes = almacenService.readAll();
			if(Almacenes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Almacenes, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PostMapping
	public ResponseEntity<Almacen> crear(@Valid @RequestBody Almacen cat){
		try {
			Almacen a = almacenService.create(cat);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/{id}")
	public ResponseEntity<Almacen> getAlmacenId(@PathVariable("id") Long id){
		try {
			Almacen a = almacenService.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Almacen> delAlmacen(@PathVariable("id") Long id){
		try {
			almacenService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAlmacen(@PathVariable("id") Long id, @Valid @RequestBody Almacen cat){

			Optional<Almacen> a = almacenService.read(id);
			if(!a.isEmpty()) {
				return new ResponseEntity<>(almacenService.update(cat), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
}
