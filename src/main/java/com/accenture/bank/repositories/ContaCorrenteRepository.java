package com.accenture.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.accenture.bank.models.ContaCorrente;

@Repository
public interface ContaCorrenteRepository extends JpaRepository<ContaCorrente, Integer>{

	@Query("SELECT c FROM ContaCorrente c WHERE c.contaCorrenteNumero = ?1")
	public ContaCorrente findByContaCorrenteNumero(String conta);

}
