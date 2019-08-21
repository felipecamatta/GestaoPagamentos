package com.felipe.gestaopagamentos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.gestaopagamentos.model.Pagamento;
import com.felipe.gestaopagamentos.service.PagamentoService;

@RestController
@RequestMapping("/pagamentos")
@CrossOrigin(origins = "http://localhost:4200")
public class PagamentoController {

	PagamentoService pagamentoService;

	public PagamentoController(PagamentoService pagamentoService) {
		this.pagamentoService = pagamentoService;
	}

	@GetMapping
	public List<Pagamento> getPagamentos() {
		return pagamentoService.getAllPagamentos();
	}

	@GetMapping(path = { "/{id}" })
	public Pagamento getFuncionarioById(@PathVariable Long id) {
		return pagamentoService.getPagamento(id);
	}

	@PostMapping
	public Pagamento create(@RequestBody Pagamento pagamento) {
		return pagamentoService.save(pagamento);
	}

}
