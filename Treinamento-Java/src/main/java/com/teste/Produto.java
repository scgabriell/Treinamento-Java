package com.teste;

//import java.util.Scanner;


public class Produto {
	private String codigo;
	private String nome;
	private String cor;
	private Double preco;
	private String marca;
	

	
	
	public Produto(String codigo, String nome, String cor, Double preco, String marca) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.marca = marca;
	}

	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
				return true;
		if (obj == null)
				return false;
		if (getClass() != obj.getClass())
				return false;
		Produto other = (Produto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
}


