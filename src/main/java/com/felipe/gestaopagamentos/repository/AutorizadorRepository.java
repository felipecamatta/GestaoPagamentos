package com.felipe.gestaopagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gestaopagamentos.model.Autorizador;

public interface AutorizadorRepository extends JpaRepository<Autorizador, Long> {

}
