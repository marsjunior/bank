package com.accenture.bank.controllers.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.bank.models.Cliente;
import com.accenture.bank.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente cadastrarCliente(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	public Cliente getCliente(Integer id) {
		return this.clienteRepository.findById(id).get();
	}
}
