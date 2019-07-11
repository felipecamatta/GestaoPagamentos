package com.felipe.gestaopagamentos.service;

import javax.validation.constraints.Min;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Funcionario;

@Validated
public interface FuncionarioService {

	Iterable<Funcionario> getAllFuncionarios();

	Funcionario getFuncionario(@Min(value = 1L, message = "ID Funcionário Inválido.") long id);

	Funcionario save(Funcionario funcionario);

	ResponseEntity<Funcionario> update(long id, Funcionario funcionario);

	ResponseEntity<?> deleteById(long id);

}
