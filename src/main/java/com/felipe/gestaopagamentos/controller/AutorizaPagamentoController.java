package com.felipe.gestaopagamentos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.gestaopagamentos.model.Pagamento;
import com.felipe.gestaopagamentos.service.AutorizadorService;
import com.felipe.gestaopagamentos.service.PagamentoService;

@RestController
@RequestMapping("/autorizarpagamentos")
@CrossOrigin(origins = "http://localhost:4200")
public class AutorizaPagamentoController {

	private PagamentoService pagamentoService;
	private AutorizadorService autorizadorService;

	public AutorizaPagamentoController(PagamentoService pagamentoService) {
		this.pagamentoService = pagamentoService;
	}

	@GetMapping
	public Iterable<Pagamento> getPagamentosNaoAutorizados() {
		return pagamentoService.getPagamentosNaoAutorizados();
	}

	@PostMapping
	public boolean autorizarPagamentos(@RequestBody Pagamento[] pagamentos) {
		System.out.print(pagamentos[0]);
		return autorizadorService.autorizar(pagamentos);
	}
}
