package com.accenture.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.bank.models.Agencia;

@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Integer>{

}
