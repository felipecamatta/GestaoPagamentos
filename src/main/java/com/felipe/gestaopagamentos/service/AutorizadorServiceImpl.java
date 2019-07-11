package com.felipe.gestaopagamentos.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipe.gestaopagamentos.model.Autorizador;
import com.felipe.gestaopagamentos.repository.AutorizadorRepository;

@Service
@Transactional
public class AutorizadorServiceImpl implements AutorizadorService {

	private AutorizadorRepository autorizadorRepository;

	public AutorizadorServiceImpl(AutorizadorRepository autorizadorRepository) {
		this.autorizadorRepository = autorizadorRepository;
	}

	public Iterable<Autorizador> getAllAutorizadores() {
		return autorizadorRepository.findAll();
	}

	public Autorizador getAutorizador(long id) {
		return autorizadorRepository.findById(id).orElse(null);
	}

	public Autorizador save(Autorizador autorizador) {
		return autorizadorRepository.save(autorizador);
	}

	public ResponseEntity<Autorizador> update(long id, Autorizador autorizador) {
		return autorizadorRepository.findById(id).map(record -> {
			record.setCargo(autorizador.getCargo());
			record.setLimite(autorizador.getLimite());
			record.setDisponivel(autorizador.getDisponivel());
			Autorizador updated = save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	public ResponseEntity<?> deleteById(long id) {
		return autorizadorRepository.findById(id).map(record -> {
			autorizadorRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
