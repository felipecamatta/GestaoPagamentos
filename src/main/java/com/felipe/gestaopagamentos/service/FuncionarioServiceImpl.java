package com.felipe.gestaopagamentos.service;

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

}
