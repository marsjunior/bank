package com.accenture.bank.controllers.services;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.bank.models.ContaCorrente;
import com.accenture.bank.models.Extrato;
import com.accenture.bank.models.Operacao;
import com.accenture.bank.repositories.ContaCorrenteRepository;
import com.accenture.bank.repositories.ExtratoRepository;

@Service
public class ContaCorrenteService {
	
	@Autowired
	private ContaCorrenteRepository contaRepository;
	
	@Autowired
	private ExtratoRepository extratoRepository;
	
	public float deposito(String conta, float vlOperacao) {
		ContaCorrente contaCorrente = this.contaRepository.findByContaCorrenteNumero(conta);
		
		Extrato extrato = new Extrato();
		extrato.setContaCorrente(contaCorrente);
		Operacao operacao = Operacao.DEPOSITO;
		extrato.setOperacao(operacao);
		extrato.setValorDaOperacao(vlOperacao);
//		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
		extrato.setDataHoraMovimento(date);
		Extrato extratoSavo = this.extratoRepository.save(extrato);
		
		contaCorrente.deposito(vlOperacao);
		contaRepository.save(contaCorrente);
		return contaCorrente. getContaCorrenteSaldo();
		
	}
}
