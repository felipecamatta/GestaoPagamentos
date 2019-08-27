package com.felipe.gestaopagamentos.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipe.gestaopagamentos.model.Autorizador;
import com.felipe.gestaopagamentos.model.Pagamento;
import com.felipe.gestaopagamentos.repository.AutorizadorRepository;

@Service
@Transactional
public class AutorizadorServiceImpl implements AutorizadorService {

	private AutorizadorRepository autorizadorRepository;

	public AutorizadorServiceImpl(AutorizadorRepository autorizadorRepository) {
		this.autorizadorRepository = autorizadorRepository;
	}

	public List<Autorizador> getAllAutorizadores() {
		return autorizadorRepository.findAll();
	}

	public Autorizador getAutorizador(Long id) {
		return autorizadorRepository.findById(id).orElse(null);
	}

	public Autorizador save(Autorizador autorizador) {
		return autorizadorRepository.save(autorizador);
	}

	public ResponseEntity<Autorizador> update(Long id, Autorizador autorizador) {
		return autorizadorRepository.findById(id).map(record -> {
			record.setCargo(autorizador.getCargo());
			record.setLimite(autorizador.getLimite());
			record.setDisponivel(autorizador.getDisponivel());
			Autorizador updated = save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	public ResponseEntity<?> deleteById(Long id) {
		return autorizadorRepository.findById(id).map(record -> {
			autorizadorRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

	public boolean autorizar(Pagamento[] pagamentos) {
		try {
			for (Pagamento pagamento : pagamentos) {
				pagamento.setStatus("Pago");
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

}
