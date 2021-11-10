package com.pauloricardoma.vendas.services;

import java.util.List;
import java.util.stream.Collectors;

import com.pauloricardoma.vendas.DTO.ClienteDTO;
import com.pauloricardoma.vendas.entities.Cliente;
import com.pauloricardoma.vendas.repositories.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

  @Autowired
  private ClienteRepository clienteRepository;

	public List<ClienteDTO> findAll() {
    List<Cliente>res=clienteRepository.findAll();
    return res.stream().map(c->new ClienteDTO(c)).collect(Collectors.toList());
	}
	
}
