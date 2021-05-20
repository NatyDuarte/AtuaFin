package br.com.atuafinanceira.atuafinanceira.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.atuafinanceira.atuafinanceira.model.Fenix;
import br.com.atuafinanceira.atuafinanceira.repositorio.FenixRepositorio;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FenixController {

	@Autowired
	private FenixRepositorio repository;
	
	
	@GetMapping("/nome/{nome_cliente}")
	public ResponseEntity<List<Fenix>> getByName(@PathVariable String nome_cliente){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome_cliente));
	}
	
	

	
}
