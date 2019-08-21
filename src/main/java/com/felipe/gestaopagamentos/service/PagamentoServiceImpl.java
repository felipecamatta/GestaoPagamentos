package com.felipe.gestaopagamentos.service;

import java.util.List;

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
	public List<Pagamento> getAllPagamentos() {
		return pagamentoRepository.findAll();
	}

	@Override
	public Pagamento getPagamento(Long id) {
		return pagamentoRepository.findById(id).orElse(null);
	}

	@Override
	public Pagamento save(Pagamento pagamento) {
		return pagamentoRepository.save(pagamento);
	}

	@Override
	public List<Pagamento> getPagamentosNaoAutorizados() {
		return pagamentoRepository.findByStatus("Pendente");
	}

}
