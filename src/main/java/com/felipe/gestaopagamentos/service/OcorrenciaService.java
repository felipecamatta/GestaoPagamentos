package com.felipe.gestaopagamentos.service;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.felipe.gestaopagamentos.model.Ocorrencia;
import com.felipe.gestaopagamentos.model.Pagamento;

@Validated
public interface OcorrenciaService {

	@NotNull
	Iterable<Ocorrencia> getAllOcorrencias();
	
	Ocorrencia getOcorrencia(@Min(value = 1L, message = "Invalid Ocorrencia ID.") long id);
	
	Ocorrencia save(Ocorrencia ocorrencia);
	
	Iterable<Ocorrencia> getOcorrenciasByPagamento(Pagamento pagamento);
}
