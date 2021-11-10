package com.pauloricardoma.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.pauloricardoma.vendas.DTO.ComprasDTO;
import com.pauloricardoma.vendas.entities.Compras;
import com.pauloricardoma.vendas.repositories.ComprasRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComprasService {
  
  @Autowired
  private ComprasRepository comprasRepository;

	public List<ComprasDTO> findAll() {
    List<Compras>res=comprasRepository.findAll();
    return res.stream().map(c->new ComprasDTO(c)).collect(Collectors.toList());
	}

}
