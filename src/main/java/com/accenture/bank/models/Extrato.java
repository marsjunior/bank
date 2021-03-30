package com.accenture.bank.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;

@Entity
public class Extrato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idExtrato;
	
	private Date dataHoraMovimento;
	
	@Max(10)
	private Operacao operacao;
	
	private Float valorDaOperacao;
	
	@ManyToOne
	private ContaCorrente contaCorrente;

	
	public int getIdExtrato() {
		return idExtrato;
	}

	public void setIdExtrato(int idExtrato) {
		this.idExtrato = idExtrato;
	}

	public Date getDataHoraMovimento() {
		return dataHoraMovimento;
	}

	public void setDataHoraMovimento(Date dataHoraMovimento) {
		this.dataHoraMovimento = dataHoraMovimento;
	}

	public Operacao getOperacao() {
		return operacao;
	}

	public void setOperacao(Operacao operacao) {
		this.operacao = operacao;
	}

	public Float getValorDaOperacao() {
		return valorDaOperacao;
	}

	public void setValorDaOperacao(Float valorDaOperacao) {
		this.valorDaOperacao = valorDaOperacao;
	}

	public ContaCorrente getIdContaCorrent() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}
	
	

}
