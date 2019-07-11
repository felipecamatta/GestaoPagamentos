package com.felipe.gestaopagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.felipe.gestaopagamentos.model.Funcionario;

@CrossOrigin(origins = "https://localhost:4200")
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

}
