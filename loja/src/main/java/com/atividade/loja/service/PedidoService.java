package com.atividade.loja.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atividade.loja.entity.Pedido;

@Service
public class PedidoService {
	
	private String url = "http://localhost:9090/pedido";
	
	/**
	 * Método responsável por enviar o pedido para o fornecedor.
	 * 
	 * @param pedido
	 * @return
	 */
	public ResponseEntity<?> realizarPedido(Pedido pedido) {
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
