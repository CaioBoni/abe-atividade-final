package com.atividade.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.loja.entity.Orcamento;
import com.atividade.loja.entity.Pedido;
import com.atividade.loja.service.OrcamentoService;
import com.atividade.loja.service.PedidoService;

@RestController
public class TestController {
	
	@Autowired OrcamentoService orcamentoService;
	@Autowired PedidoService pedidoService;

	@GetMapping(value = "/test/responderOrcamento", produces = "application/json")
	public ResponseEntity<?> responderOrcamento() {
		return orcamentoService.responderOrcamento(new Orcamento(), true);
	}
	
	@GetMapping(value = "/test/realizarPedido", produces = "application/json")
	public ResponseEntity<?> realizarPedido() {
		return pedidoService.realizarPedido(new Pedido());
	}
	
}
