package com.teste;

import java.util.Objects;

public class Empresa {
	private String nome;
	private String razaoSocial;
	private String endereço;
	private String CNPJ;
	private String municipio;
	private String telefone;
	
	public Empresa(String cnpj, String nome, String razaoSocial, String endereço,String municipio,String telefone) {
		this.CNPJ = cnpj;
		this.nome = nome;
		this.razaoSocial = razaoSocial;
		this.endereço = endereço;
		this.municipio = municipio;
		this.telefone = telefone;
	}
	

	
	// Getters and Setters
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
	
	public String getCNPJ() {
		return CNPJ;
	}
	
	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String getMunicipio() {
		return municipio;
	}
	
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}





	public static void add(Empresa empresa) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
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
		Empresa other = (Empresa) obj;
		return Objects.equals(CNPJ, other.CNPJ);
	}



	@Override
	public String toString() {
		return "Empresa [nome=" + nome + ", razaoSocial=" + razaoSocial + ", endereço=" + endereço + ", CNPJ=" + CNPJ
				+ ", municipio=" + municipio + ", telefone=" + telefone + "]";
	}
	
    public static void main(String[] args) {  
        Empresa Empresa = new Empresa("1111111","fulano", "piao","fac", "ffd", "sfsfs");  
        System.out.println(Empresa);  
    }
}
