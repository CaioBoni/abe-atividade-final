package com.atividade.loja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.loja.entity.Orcamento;

@RestController
public class OrcamentoController {
	
	/**
	 * Recebe orcamento enviado pelo fornecedor
	 * 
	 * @param orcamento
	 * @return
	 */
	@PostMapping(value = "/orcamento", produces = "application/json")
	public ResponseEntity<?> receberOrcamento(@RequestBody Orcamento orcamento) {
		return new ResponseEntity<>(orcamento, HttpStatus.OK);
	}
}
