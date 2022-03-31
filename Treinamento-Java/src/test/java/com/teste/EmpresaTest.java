package com.teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmpresaTest {
	private static Scanner entrada;
	private static List<Empresa> empresa;

	public static void main1(String[] args) {
		entrada = new Scanner(System.in);
		int opcao;
		empresa = new ArrayList<Empresa>();

		do{
			System.out.print("Digite 1 para cadastrar uma Empresa e  (2 para sair): ");
			opcao = Integer.parseInt(entrada.nextLine());
			switch(opcao){
				case 1:
					System.out.print("Digite o CNPJ da Empresa: ");
					String cnpj = entrada.nextLine();
					System.out.print("Digite o nome da Empresa: ");
					String nomeEmpresa = entrada.nextLine();
					System.out.print("Digite a razão social da Empresa: ");
					String razaoSocial = entrada.nextLine();
					System.out.print("Digite o endereço da empresa: ");
					String endereço =  entrada.nextLine();
					System.out.print("Digite o municipio da empresa: ");
					String municipio = entrada.nextLine();
					System.out.print("Digite o telefone da empresa: ");
					String telefone = entrada.nextLine();

					Empresa.add(new Empresa(cnpj,nomeEmpresa,razaoSocial,endereço,municipio,telefone));

					break;
				case 2:
					System.out.print("Saindo...");
					break;
				default: System.out.println("Opção inválida.");
				}
			}while(opcao!=2);
			
		}

	public static List<Empresa> getEmpresa() {
		return empresa;
	}

	public static void setEmpresa(List<Empresa> empresa) {
		EmpresaTest.empresa = empresa;
	}
}	
		
		
			
			
	
	


