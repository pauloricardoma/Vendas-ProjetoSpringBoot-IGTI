package com.pauloricardoma.vendas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.pauloricardoma.vendas.DTO.ComprasDTO;
import com.pauloricardoma.vendas.services.ComprasService;

@RestController // classe vai ter endpoints
@RequestMapping(value = "/compras") // caminho do endpoint
public class ComprasController {
	
	@Autowired
	private ComprasService comprasService;
	
	@GetMapping
	public ResponseEntity<List<ComprasDTO>>findAll() {
		List<ComprasDTO> lista = comprasService.findAll();
		return ResponseEntity.ok(lista);
	}
}