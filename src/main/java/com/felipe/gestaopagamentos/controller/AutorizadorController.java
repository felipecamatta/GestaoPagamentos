package com.felipe.gestaopagamentos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.gestaopagamentos.model.Autorizador;
import com.felipe.gestaopagamentos.service.AutorizadorService;

@RestController
@RequestMapping("/autorizadores")
public class AutorizadorController {
	
	private AutorizadorService autorizadorService;

	public AutorizadorController(AutorizadorService autorizadorService) {
		this.autorizadorService = autorizadorService;
	}
	
	@GetMapping
	public Iterable<Autorizador> getAutorizadores() {
		return autorizadorService.getAllAutorizadores();
	}

	@GetMapping(path = { "/{id}" })
	public Autorizador getAutorizadorById(@PathVariable long id) {
		return autorizadorService.getAutorizador(id);
	}

	@PostMapping
	public Autorizador create(@RequestBody Autorizador autorizador) {
		return autorizadorService.save(autorizador);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Autorizador> update(@PathVariable("id") long id, @RequestBody Autorizador autorizador) {
		return autorizadorService.update(id, autorizador);
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable long id) {
		return autorizadorService.deleteById(id);
	}
	
}
