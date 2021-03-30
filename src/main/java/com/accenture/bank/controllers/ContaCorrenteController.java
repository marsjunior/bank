package com.accenture.bank.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.bank.controllers.services.ContaCorrenteService;

@RestController("/contaCorrente/")
public class ContaCorrenteController {
	
	@Autowired
	ContaCorrenteService contaService;
	
	@PostMapping("deposito/")
	public ResponseEntity<Float> deposito(@Valid @RequestBody String conta, float vlOperacao) {
		float saldo = contaService.deposito(conta, vlOperacao);
		return new ResponseEntity<Float>(saldo, HttpStatus.OK);
	}

}
