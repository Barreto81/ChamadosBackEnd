package com.br.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="chamados")
public class Chamados {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="cliente")
	private String cliente;
	
	@Column(name="data_abertura")
	private Date data_abertura;
	
	@Column(name="data_encerramento")
	private Date data_encerramento;

	public Chamados() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chamados(Long id, String titulo, String descricao, String cliente, Date data_abertura,
			Date data_encerramento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.cliente = cliente;
		this.data_abertura = data_abertura;
		this.data_encerramento = data_encerramento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Date getData_abertura() {
		return data_abertura;
	}

	public void setData_abertura(Date data_abertura) {
		this.data_abertura = data_abertura;
	}

	public Date getData_encerramento() {
		return data_encerramento;
	}

	public void setData_encerramento(Date data_encerramento) {
		this.data_encerramento = data_encerramento;
	}
	
	
	
	
	
	

	

	
	
	
	

	

}
