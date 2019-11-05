package com.atividade.fornecedor.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atividade.fornecedor.entity.Pedido;

@Service
public class PedidoService {

	private String url = "http://localhost:8080/pedido";
	
	/**
	 * Método que realiza atualização do status do pedido a cada
	 * alteração em relação ao fluxo de produção e entrega do mesmo.
	 * 
	 * @param pedido
	 * @return
	 */
	public ResponseEntity<?> atualizarPedido(Pedido pedido) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> response;
		HttpEntity<?> entity = new HttpEntity<Object>(pedido);
		try {
			response = restTemplate.exchange(url, HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
	}
}
