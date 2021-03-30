package com.accenture.bank.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.bank.models.Cliente;
import com.accenture.bank.services.ClienteService;


@RestController("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable(value = "id") Integer id){
		Cliente cliente = this.clienteService.getCliente(id);
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Cliente> cadastrarCliente( @Valid @RequestBody Cliente cliente) {
		Cliente clienteSalvo = this.clienteService.cadastrarCliente(cliente);
		return new ResponseEntity<Cliente>(clienteSalvo, HttpStatus.OK);
	}
}
