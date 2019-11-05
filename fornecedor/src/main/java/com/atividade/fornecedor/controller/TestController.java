package com.atividade.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.fornecedor.entity.Orcamento;
import com.atividade.fornecedor.entity.Pedido;
import com.atividade.fornecedor.service.OrcamentoService;
import com.atividade.fornecedor.service.PedidoService;

@RestController
public class TestController {
	
	@Autowired OrcamentoService orcamentoService;
	@Autowired PedidoService pedidoService;

	@GetMapping(value = "/test/enviarOrcamento", produces = "application/json")
	public ResponseEntity<?> enviarOrcamento() {
		return orcamentoService.enviarOrcamento(new Orcamento());
	}
	
	@GetMapping(value = "/test/atualizarPedido", produces = "application/json")
	public ResponseEntity<?> atualizarPedido() {
		return pedidoService.atualizarPedido(new Pedido());
	}
	
}
