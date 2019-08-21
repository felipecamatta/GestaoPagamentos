package com.felipe.gestaopagamentos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Autorizador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String cargo;

	@NotNull
	private Double limite;

	@NotNull
	private char disponivel;

	public Autorizador(Long id, @NotNull String cargo, @NotNull Double limite, @NotNull char disponivel) {
		this.id = id;
		this.cargo = cargo;
		this.limite = limite;
		this.disponivel = disponivel;
	}

	public Autorizador() {
	}

	public Long getId() {
		return id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}

	public char getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(char disponivel) {
		this.disponivel = disponivel;
	}

}
