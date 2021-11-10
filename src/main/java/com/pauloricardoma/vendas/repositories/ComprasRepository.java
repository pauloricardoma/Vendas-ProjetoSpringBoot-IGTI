package com.pauloricardoma.vendas.repositories;

import java.util.List;

import com.pauloricardoma.vendas.DTO.RankingComprasDTO;
import com.pauloricardoma.vendas.entities.Compras;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ComprasRepository extends JpaRepository<Compras, Integer> {
  @Query("SELECT new com.pauloricardoma.vendas.DTO.RankingComprasDTO(compras.cliente, SUM(compras.totalCompra)) " 
        + "FROM Compras AS compras GROUP BY compras.cliente ORDER BY SUM(compras.totalCompra) DESC")
  List<RankingComprasDTO>findRanking();
}
