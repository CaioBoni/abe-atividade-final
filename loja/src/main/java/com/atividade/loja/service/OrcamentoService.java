package com.atividade.loja.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atividade.loja.entity.Orcamento;

@Service
public class OrcamentoService {

	private String url = "http://localhost:9090/orcamento";
	
	/**
	 * Método que aprova ou rejeita um orcamento para o fornecedor.
	 * 
	 * @param orcamento
	 * @return
	 */
	public ResponseEntity<?> responderOrcamento(Orcamento orcamento, Boolean aceito) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> response;
		
		orcamento.setAceito(aceito);
		HttpEntity<?> entity = new HttpEntity<Object>(orcamento);
		try {
			response = restTemplate.exchange(url, HttpMethod.POST, entity, Object.class);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(response.getBody(), HttpStatus.OK);
	}
}
