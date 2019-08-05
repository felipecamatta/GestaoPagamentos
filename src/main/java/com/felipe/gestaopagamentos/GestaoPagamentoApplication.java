package com.felipe.gestaopagamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.felipe.gestaopagamentos.model.Autorizador;
import com.felipe.gestaopagamentos.model.Funcionario;
import com.felipe.gestaopagamentos.model.Ocorrencia;
import com.felipe.gestaopagamentos.model.Pagamento;
import com.felipe.gestaopagamentos.service.FuncionarioService;
import com.felipe.gestaopagamentos.service.AutorizadorService;
import com.felipe.gestaopagamentos.service.PagamentoService;
import com.felipe.gestaopagamentos.service.OcorrenciaService;

@SpringBootApplication
public class GestaoPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoPagamentoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AutorizadorService autorizadorService, FuncionarioService funcionarioService, PagamentoService pagamentoService, OcorrenciaService ocorrenciaService) {
		List<Ocorrencia> lista = new ArrayList<>();
		return args -> {
			Funcionario f1 = funcionarioService.save(new Funcionario(1L, "Felipe", "Gerente"));
			Funcionario f2 = funcionarioService.save(new Funcionario(2L, "Luciano", "Gerente"));
			funcionarioService.save(new Funcionario(3L, "José", "Gerente"));
			funcionarioService.save(new Funcionario(4L, "Lucas", "Escravo"));
			Pagamento pagamento = pagamentoService.save(new Pagamento(1L, "Desc", 2000.00, LocalDate.now(), LocalDate.of(2019, 07, 20), "pendente" ,lista, f1));
			ocorrenciaService.save(new Ocorrencia(1L, "Desc", "Joao", pagamento));
			Pagamento pagamento1 = pagamentoService.save(new Pagamento(2L, "123abc", 987.00, LocalDate.now(), LocalDate.of(2019, 07, 20), "pago", lista, f2));
			ocorrenciaService.save(new Ocorrencia(2L, "123abc", "Lucas", pagamento1));
			Autorizador a1 = autorizadorService.save(new Autorizador(1L, "Escravo", 500.00, 's'));
		};
	}
}