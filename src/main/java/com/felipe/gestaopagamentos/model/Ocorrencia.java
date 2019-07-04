package com.felipe.gestaopagamentos.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String descricao;

	@NotNull
	private String usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pagamento_id", nullable = false)
	private Pagamento pagamento;

	public Ocorrencia(Long id, @NotNull String descricao, @NotNull String usuario, Pagamento pagamento) {
		this.id = id;
		this.descricao = descricao;
		this.usuario = usuario;
		this.pagamento = pagamento;
	}

	public Ocorrencia() {
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}
