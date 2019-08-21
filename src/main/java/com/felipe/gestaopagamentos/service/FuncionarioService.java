package com.felipe.gestaopagamentos.service;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Funcionario;

@Validated
public interface FuncionarioService {

	List<Funcionario> getAllFuncionarios();

	Funcionario getFuncionario(@Min(value = 1L, message = "ID Funcionário Inválido.") Long id);

	Funcionario save(Funcionario funcionario);

	ResponseEntity<Funcionario> update(Long id, Funcionario funcionario);

	ResponseEntity<?> deleteById(Long id);

}
