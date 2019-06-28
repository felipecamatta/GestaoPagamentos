package com.felipe.gestaopagamentos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.felipe.gestaopagamentos.model.Funcionario;
import com.felipe.gestaopagamentos.service.FuncionarioService;

@SpringBootApplication
public class GestaoPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoPagamentoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(FuncionarioService funcionarioService) {
		return args -> {
			funcionarioService.save(new Funcionario(1L, "Felipe", "Gerente"));
			funcionarioService.save(new Funcionario(2L, "Luciano", "Gerente"));
			funcionarioService.save(new Funcionario(3L, "José", "Gerente"));
		};
	}

}
