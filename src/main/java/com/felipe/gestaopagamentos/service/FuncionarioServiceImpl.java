package com.felipe.gestaopagamentos.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felipe.gestaopagamentos.model.Funcionario;
import com.felipe.gestaopagamentos.repository.FuncionarioRepository;

@Service
@Transactional
public class FuncionarioServiceImpl implements FuncionarioService {

	private FuncionarioRepository funcionarioRepository;

	public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	public Iterable<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}

	public Funcionario getFuncionario(long id) {
		return funcionarioRepository.findById(id).orElse(null);
	}

	public Funcionario save(Funcionario funcionario) {
		return funcionarioRepository.save(funcionario);
	}

	public ResponseEntity<Funcionario> update(long id, Funcionario funcionario) {
		return funcionarioRepository.findById(id).map(record -> {
			record.setNome(funcionario.getNome());
			record.setCargo(funcionario.getCargo());
			Funcionario updated = save(record);
			return ResponseEntity.ok().body(updated);
		}).orElse(ResponseEntity.notFound().build());
	}

	public ResponseEntity<?> deleteById(long id) {
		return funcionarioRepository.findById(id).map(record -> {
			funcionarioRepository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
