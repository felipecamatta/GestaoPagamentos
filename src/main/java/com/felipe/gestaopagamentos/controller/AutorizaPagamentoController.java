package com.felipe.gestaopagamentos.controller;

import java.util.List;

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
	public List<Pagamento> getPagamentosNaoAutorizados() {
		return pagamentoService.getPagamentosNaoAutorizados();
	}

	@PostMapping
	public boolean autorizarPagamentos(@RequestBody Long[] idsPagamentos) {
		//System.out.println("Entrou1");
		Pagamento[] pagamentos = new Pagamento[idsPagamentos.length];
		for (int i = 0; i < idsPagamentos.length; i++) {
			System.out.println(i);
			pagamentos[i] = pagamentoService.getPagamento(idsPagamentos[i]);
		}
		System.out.println("saiu");
		//return true;
		return autorizadorService.autorizar(pagamentos);
	}
}
