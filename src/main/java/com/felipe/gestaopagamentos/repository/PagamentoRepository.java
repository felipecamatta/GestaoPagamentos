package com.felipe.gestaopagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gestaopagamentos.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
