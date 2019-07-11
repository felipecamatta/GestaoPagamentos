package com.felipe.gestaopagamentos.service;

import javax.validation.constraints.Min;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Autorizador;

@Validated
public interface AutorizadorService {

	Iterable<Autorizador> getAllAutorizadores();

	Autorizador getAutorizador(@Min(value = 1L, message = "ID Autorizador Inválido.") long id);

	Autorizador save(Autorizador autorizador);

	ResponseEntity<Autorizador> update(long id, Autorizador autorizador);

	ResponseEntity<?> deleteById(long id);

}
