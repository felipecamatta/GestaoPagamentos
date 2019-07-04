package com.felipe.gestaopagamentos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.felipe.gestaopagamentos.model.Funcionario;
import com.felipe.gestaopagamentos.model.Ocorrencia;
import com.felipe.gestaopagamentos.model.Pagamento;
import com.felipe.gestaopagamentos.service.FuncionarioService;
import com.felipe.gestaopagamentos.service.PagamentoService;
import com.felipe.gestaopagamentos.service.OcorrenciaService;

@SpringBootApplication
public class GestaoPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoPagamentoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(FuncionarioService funcionarioService, PagamentoService pagamentoService, OcorrenciaService ocorrenciaService) {
		List<Ocorrencia> lista = new ArrayList<>();
		return args -> {
			funcionarioService.save(new Funcionario(1L, "Felipe", "Gerente"));
			funcionarioService.save(new Funcionario(2L, "Luciano", "Gerente"));
			funcionarioService.save(new Funcionario(3L, "José", "Gerente"));
			Pagamento pagamento = pagamentoService.save(new Pagamento(1L, "Desc", 2000.00, LocalDate.now(), LocalDate.of(2019, 07, 20), lista));
			pagamentoService.save(new Pagamento(2L, "Desc", 2000.00, LocalDate.now(), LocalDate.of(2019, 07, 20), lista));
			ocorrenciaService.save(new Ocorrencia(1L, "Desc", "Joao", pagamento));
			//pagamentoService.save(new Pagamento(1L, "Desc", 2000.00, LocalDate.now(), LocalDate.of(2019, 07, 20)));
            //pagamentoService.save(new Pagamento(2L, "Desc", 2000.00, LocalDate.now(), LocalDate.of(2019, 07, 20)));
		};
	}
}