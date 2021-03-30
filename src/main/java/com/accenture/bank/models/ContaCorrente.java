package com.accenture.bank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;

@Entity
public class ContaCorrente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContaCorrente;
	
	@Max(3)
	private String contaCorrenteAgencia;
	
	@Max(45)
	private String contaCorrenteNumero;
	
	
	private Float contaCorrenteSaldo;
	
	@ManyToOne
	private Cliente cliente;
	

	public int getIdContaCorrente() {
		return idContaCorrente;
	}

	public void setIdContaCorrente(Integer idContaCorrente) {
		this.idContaCorrente = idContaCorrente;
	}

	public String getContaCorrenteAgencia() {
		return contaCorrenteAgencia;
	}

	public void setContaCorrenteAgencia(String contaCorrenteAgencia) {
		this.contaCorrenteAgencia = contaCorrenteAgencia;
	}

	public String getContaCorrenteNumero() {
		return contaCorrenteNumero;
	}

	public void setContaCorrenteNumero(String contaCorrenteNumero) {
		this.contaCorrenteNumero = contaCorrenteNumero;
	}

	public Float getContaCorrenteSaldo() {
		return contaCorrenteSaldo;
	}
	
	public void deposito(Float contaCorrenteSaldo) {
		this.contaCorrenteSaldo += contaCorrenteSaldo;
	}

	public void setContaCorrenteSaldo(Float contaCorrenteSaldo) {
		this.contaCorrenteSaldo = contaCorrenteSaldo;
	}

	public Cliente getIdCliente() {
		return cliente;
	}

	public void setIdCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
}
