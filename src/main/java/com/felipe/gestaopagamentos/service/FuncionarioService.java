package com.felipe.gestaopagamentos.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Funcionario;

@Validated
public interface FuncionarioService {

	@NotNull
	Iterable<Funcionario> getAllFuncionarios();

	Funcionario getFuncionario(@Min(value = 1L, message = "ID Funcionário Inválido.") long id);

	Funcionario save(Funcionario funcionario);

}
