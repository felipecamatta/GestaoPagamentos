package com.felipe.gestaopagamentos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String descricao;

	@Column(nullable = false)
	private String usuario;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pagamento_id", nullable = false)
	private Pagamento pagamento;

	public Ocorrencia(Long id, String descricao, String usuario) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.usuario = usuario;
	}

	public Ocorrencia() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
