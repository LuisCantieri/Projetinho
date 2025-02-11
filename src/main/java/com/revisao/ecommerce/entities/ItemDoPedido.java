package com.revisao.ecommerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_item_pedido")
public class ItemDoPedido {

	@EmbeddedId
	private ItemDoPedidoPk id = new ItemDoPedidoPk()
;	private Integer quantidade;
	private Double preco;

public ItemDoPedido() {
  }

	public ItemDoPedido(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
	id.setPedido(pedido);
	id.setProduto(produto);	
	this.quantidade = quantidade;
	this.preco = preco;
}

	
	
	public Pedido getPedido() {
		return id.getPedido();
	}

	public void setId(Pedido pedido) {
		id.setPedido(pedido);
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}

	public void setId(Produto produto) {
		id.setProduto(produto);
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
}
