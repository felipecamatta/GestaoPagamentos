package com.felipe.gestaopagamentos.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipe.gestaopagamentos.model.Pagamento;
import com.felipe.gestaopagamentos.repository.PagamentoRepository;

@Service
@Transactional
public class PagamentoServiceImpl implements PagamentoService {

	private PagamentoRepository pagamentoRepository;

	public PagamentoServiceImpl(PagamentoRepository pagamentoRepository) {
		this.pagamentoRepository = pagamentoRepository;
	}

	@Override
	public Iterable<Pagamento> getAllPagamentos() {
		return pagamentoRepository.findAll();
	}

	@Override
	public Pagamento getPagamento(long id) {
		return pagamentoRepository.findById(id).orElse(null);
	}

	@Override
	public Pagamento save(Pagamento pagamento) {
		return pagamentoRepository.save(pagamento);
	}

	@Override
	public Iterable<Pagamento> getPagamentosNaoAutorizados() {
		return pagamentoRepository.findByStatus("pendente");
	}
	
}
