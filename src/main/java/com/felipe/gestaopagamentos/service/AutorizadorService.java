package com.felipe.gestaopagamentos.service;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Autorizador;
import com.felipe.gestaopagamentos.model.Pagamento;

@Validated
public interface AutorizadorService {

	List<Autorizador> getAllAutorizadores();

	Autorizador getAutorizador(@Min(value = 1L, message = "ID Autorizador Inválido.") Long id);

	Autorizador save(Autorizador autorizador);

	ResponseEntity<Autorizador> update(Long id, Autorizador autorizador);

	ResponseEntity<?> deleteById(Long id);

	boolean autorizar(Pagamento[] pagamentos);

}
