package com.felipe.gestaopagamentos.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipe.gestaopagamentos.model.Ocorrencia;
import com.felipe.gestaopagamentos.repository.OcorrenciaRepository;

@Service
@Transactional
public class OcorrenciaServiceImpl implements OcorrenciaService {

	private OcorrenciaRepository ocorrenciaRepository;

	public OcorrenciaServiceImpl(OcorrenciaRepository ocorrenciaRepository) {
		this.ocorrenciaRepository = ocorrenciaRepository;
	}

	public Iterable<Ocorrencia> getAllOcorrencias() {
		return ocorrenciaRepository.findAll();
	}

	public Ocorrencia getOcorrencia(long id) {
		return ocorrenciaRepository.findById(id).orElse(null);
	}

	public Ocorrencia save(Ocorrencia ocorrencia) {
		return ocorrenciaRepository.save(ocorrencia);
	}
}
