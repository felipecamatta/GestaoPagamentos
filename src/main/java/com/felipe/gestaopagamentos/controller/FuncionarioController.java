package com.felipe.gestaopagamentos.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.gestaopagamentos.model.Funcionario;
import com.felipe.gestaopagamentos.service.FuncionarioService;

@RestController
@RequestMapping("/api/funcionarios")

public class FuncionarioController {

	private FuncionarioService funcionarioService;

	public FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

	@GetMapping(value = { "", "/" })
	public @NotNull Iterable<Funcionario> getFuncionarios() {
		return funcionarioService.getAllFuncionarios();
	}

}
