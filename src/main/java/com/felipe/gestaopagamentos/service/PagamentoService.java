package com.felipe.gestaopagamentos.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Pagamento;

@Validated
public interface PagamentoService {

	@NotNull
	Iterable<Pagamento> getAllPagamentos();

	Pagamento getPagamento(@Min(value = 1L, message = "Invalid pagamento ID.") long id);

	Pagamento save(Pagamento pagamento);
	
	Iterable<Pagamento> getPagamentosNaoAutorizados();

}
