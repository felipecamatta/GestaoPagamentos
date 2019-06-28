package com.felipe.gestaopagamentos.repository;

import org.springframework.data.repository.CrudRepository;

import com.felipe.gestaopagamentos.model.Pagamento;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {

}
