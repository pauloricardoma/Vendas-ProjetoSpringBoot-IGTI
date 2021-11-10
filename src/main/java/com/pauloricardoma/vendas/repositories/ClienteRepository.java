package com.pauloricardoma.vendas.repositories;

import com.pauloricardoma.vendas.entities.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> { 

}
