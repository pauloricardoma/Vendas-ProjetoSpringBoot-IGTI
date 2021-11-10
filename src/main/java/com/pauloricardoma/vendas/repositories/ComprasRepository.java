package com.pauloricardoma.vendas.repositories;

import com.pauloricardoma.vendas.entities.Compras;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ComprasRepository extends JpaRepository<Compras, Integer> {
    
}
