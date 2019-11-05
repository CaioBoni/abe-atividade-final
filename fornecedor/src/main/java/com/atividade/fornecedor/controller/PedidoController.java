package com.atividade.fornecedor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atividade.fornecedor.entity.Pedido;

@RestController
public class PedidoController {

	/**
	 * Método responsável por recebimento do pedido e envio para as camadas
	 * responsáveis pela persistência.
	 * 
	 * @param pedido
	 * @return
	 */
	@PostMapping(value = "/pedidos", produces = "application/json")
	public ResponseEntity<?> receberPedido(@RequestBody Pedido pedido) {
		return new ResponseEntity<>(pedido, HttpStatus.OK);
	}
	
}
