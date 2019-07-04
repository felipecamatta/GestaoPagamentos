package com.felipe.gestaopagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gestaopagamentos.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
