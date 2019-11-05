package com.atividade.fornecedor.entity;

import java.util.Date;

public class Orcamento {
	
	private Pedido pedido;
	private Long valor;
	private Date dataEntrega;
	private Boolean aceito;
	
	public Boolean getAceito() {
		return aceito;
	}
	public void setAceito(Boolean aceito) {
		this.aceito = aceito;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Long getValor() {
		return valor;
	}
	public void setValor(Long valor) {
		this.valor = valor;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
}
