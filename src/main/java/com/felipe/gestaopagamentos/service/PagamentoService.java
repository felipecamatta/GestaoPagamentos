package com.felipe.gestaopagamentos.service;

import java.util.List;

import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Pagamento;

@Validated
public interface PagamentoService {

	List<Pagamento> getAllPagamentos();

	Pagamento getPagamento(@Min(value = 1L, message = "Invalid pagamento ID.") Long id);

	Pagamento save(Pagamento pagamento);
	
	List<Pagamento> getPagamentosNaoAutorizados();

}
