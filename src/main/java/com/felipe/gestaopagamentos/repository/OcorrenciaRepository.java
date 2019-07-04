package com.felipe.gestaopagamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.gestaopagamentos.model.Ocorrencia;
import com.felipe.gestaopagamentos.model.Pagamento;

public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
	Iterable<Ocorrencia> findByPagamento(Pagamento pagamento);
}
