package com.accenture.bank.models;

public enum Operacao {
	
	SAQUE("saque"),
	DEPOSITO("deposito"),
	TRANSFERENCIA("transferência");
	
	private String op;
	
	Operacao(String op){
		this.op = op;
	}

	public String getOp() {
		return op;
	}
	
}
