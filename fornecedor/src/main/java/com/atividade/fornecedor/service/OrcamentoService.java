package com.atividade.fornecedor.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atividade.fornecedor.entity.Orcamento;

@Service
public class OrcamentoService {
	
	String url = "http://localhost:8080/orcamento";
	
	/**
	 * Envia o orcamento para a API da Loja.
	 * Método criado para ser chamado a partir dos pedidos encontrados
	 * na base de dados. Pode ser chamado manualmente ou através de
	 * algum agendamento.
	 * 
	 * @param orcamento
	 * @return
	 */
	public ResponseEntity<?> enviarOrcamento(Orcamento orcamento) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> response;
		HttpEntity<?> entity = new HttpEntity<Object>(orcamento);
		try {
			response = restTemplate.exchange(url, HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
	}

}
