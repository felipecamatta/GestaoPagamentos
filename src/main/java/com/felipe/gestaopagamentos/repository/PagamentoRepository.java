package com.felipe.gestaopagamentos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gestaopagamentos.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
	List<Pagamento> findByStatus(String status);
}
