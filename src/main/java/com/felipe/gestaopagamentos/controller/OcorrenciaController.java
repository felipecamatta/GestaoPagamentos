package com.felipe.gestaopagamentos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.gestaopagamentos.model.Ocorrencia;
import com.felipe.gestaopagamentos.model.Pagamento;
import com.felipe.gestaopagamentos.service.OcorrenciaService;
import com.felipe.gestaopagamentos.service.PagamentoService;

@RestController
@RequestMapping("/pagamentos")
public class OcorrenciaController {

	private OcorrenciaService ocorrenciaService;
	private PagamentoService pagamentoService;

	public OcorrenciaController(OcorrenciaService ocorrenciaService, PagamentoService pagamentoService) {
		this.ocorrenciaService = ocorrenciaService;		
		this.pagamentoService = pagamentoService;
	}

	@GetMapping(path = { "/{id}/ocorrencias" })
	public Iterable<Ocorrencia> getOcorrenciaByPagamento(@PathVariable long id) {
		Pagamento pagamento = new Pagamento();
		pagamento = pagamentoService.getPagamento(id);
		return ocorrenciaService.getOcorrenciasByPagamento(pagamento);
	}

}
