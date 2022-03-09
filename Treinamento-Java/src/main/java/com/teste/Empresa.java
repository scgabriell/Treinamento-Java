package com.teste;

public class Empresa {
	private String nome;
	private String razaoSocial;
	private String endereço;
	private int CNPJ;
	private String Municipio;
	private String Telefone;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getEndereço() {
		return endereço;
	}
	
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	
	public int getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String getMunicipio() {
		return Municipio;
	}
	
	public void setMunicipio(String municipio) {
		Municipio = municipio;
	}
	
	public String getTelefone() {
		return Telefone;
	}
	
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
}
