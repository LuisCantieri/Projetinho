package com.revisao.ecommerce.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pagamento")
public class Pagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private Instant momento;
	
	@OneToOne
	@MapsId
	private Pedido pedido;
	
	public Pagamento(Long id, Instant momento) {
		Id = id;
		this.momento = momento;
	}
	
	public Pagamento() {
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Instant getMomento() {
		return momento;
	}
	public void setMomento(Instant momento) {
		this.momento = momento;
	}
	
}
