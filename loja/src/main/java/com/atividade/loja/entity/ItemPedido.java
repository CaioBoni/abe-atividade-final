package com.atividade.loja.entity;

public class ItemPedido {

	private Long codigoProduto;
	private Long quantidade;
	private String observacoes;
	
	public Long getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(Long codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
