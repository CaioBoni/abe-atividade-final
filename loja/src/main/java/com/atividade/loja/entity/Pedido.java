package com.atividade.loja.entity;

import java.util.List;

public class Pedido {
	
	private List<ItemPedido> itensPedidoList;
	private StatusPedidoEnum status;

	public StatusPedidoEnum getStatus() {
		return status;
	}

	public void setStatus(StatusPedidoEnum status) {
		this.status = status;
	}

	public List<ItemPedido> getItensPedidoList() {
		return itensPedidoList;
	}

	public void setItensPedidoList(List<ItemPedido> itensPedidoList) {
		this.itensPedidoList = itensPedidoList;
	}

}
