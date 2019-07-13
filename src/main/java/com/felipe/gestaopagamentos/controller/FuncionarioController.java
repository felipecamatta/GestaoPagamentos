package com.felipe.gestaopagamentos.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.gestaopagamentos.model.Funcionario;
import com.felipe.gestaopagamentos.service.FuncionarioService;

@RestController
@RequestMapping("/funcionarios")
@CrossOrigin(origins = "http://localhost:4200")
public class FuncionarioController {

	private FuncionarioService funcionarioService;

	public FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}
	
	@CrossOrigin(origins = "https://localhost:4200")

	@GetMapping
	public Iterable<Funcionario> getFuncionarios() {
		return funcionarioService.getAllFuncionarios();
	}

	@GetMapping(path = { "/{id}" })
	public Funcionario getFuncionarioById(@PathVariable long id) {
		return funcionarioService.getFuncionario(id);
	}

	@PostMapping
	public Funcionario create(@RequestBody Funcionario funcionario) {
		return funcionarioService.save(funcionario);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<Funcionario> update(@PathVariable("id") long id, @RequestBody Funcionario funcionario) {
		return funcionarioService.update(id, funcionario);
	}

	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable long id) {
		return funcionarioService.deleteById(id);
	}

}
