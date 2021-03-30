package com.accenture.bank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	
	@Max(45)
	private String clienteNome;
	
	@Max(20)
	private String clienteCPF;
	
	@Max(20)
	private String clienteFone;
	

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public void setClienteNome(String clienteNome) {
		this.clienteNome = clienteNome;
	}

	public String getClienteCPF() {
		return clienteCPF;
	}

	public void setClienteCPF(String clienteCPF) {
		this.clienteCPF = clienteCPF;
	}

	public String getClienteFone() {
		return clienteFone;
	}

	public void setClienteFone(String clienteFone) {
		this.clienteFone = clienteFone;
	}
	

}
