package com.atividade.fornecedor.entity;

public enum StatusPedidoEnum {
	
	SOLICITADO("Solicitado"), 
	EM_FABRICACAO("Em fabricação"), 
	FINALIZADO("Finalizado"), 
	DESPACHADO("Despachado");
	
	private String descricao;
	
	StatusPedidoEnum(String desc) {
		this.descricao = desc;
	}

	public String getDescricao() {
		return descricao;
	}
}
