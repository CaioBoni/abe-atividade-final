package com.atividade.fornecedor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.fornecedor.entity.Orcamento;

@RestController
public class OrcamentoController {

	/**
	 * Recebe confirmacao ou rejeicao do orcamento enviado pelo lojista.
	 * 
	 * @param orcamento
	 * @return
	 */
	@PostMapping(value = "/orcamento", produces = "application/json")
	public ResponseEntity<?> receberRespostaOrcamento(@RequestBody Orcamento orcamento) {
		return new ResponseEntity<>(orcamento, HttpStatus.OK);
	}
}
