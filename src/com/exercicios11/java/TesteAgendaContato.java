package com.exercicios11.java;

import java.util.Scanner;

public class TesteAgendaContato {

	private static Scanner scan;
	
	public static void CadastrarContato(Contato c, Scanner s) {
		System.out.println("—Nome: ");
		String nome = s.next();
		c.setNome(nome);
		
		System.out.println("—Telefone: ");
		String telefone = s.next();
		c.setTelefone(telefone);
		
		System.out.println("—Email: ");
		String email = s.next();
		c.setEmail(email);
	}
	
	public static void main(String[] args) {
		System.out.println("***Agenda***");
		
		scan = new Scanner(System.in);
		Agenda ag = new Agenda();
		
		System.out.println("—Entre com o nome da Agenda: ");
		String nomeAgenda = scan.next();
		ag.setNome(nomeAgenda);
		
		System.out.println("—Cadastro de 3 contatos: ");
		//Entrada e associação aos objetos de Contato, respectivamente cada instância
		Contato ct1 = new Contato();
			CadastrarContato(ct1, scan);
		Contato ct2 = new Contato();
			CadastrarContato(ct2, scan);
		Contato ct3 = new Contato();
			CadastrarContato(ct3, scan);
			
		//Associar em um único array
		Contato[] agC = new Contato[3];
		agC[0] = ct1;
		agC[1] = ct2;
		agC[2] = ct3;
		
		//Associar array à instância da Agenda
		ag.setContatos(agC);
		
		//Saída, métodos individuais e geral
		ag.retornaContato(ag, 0);
		ag.retornaContato(ag, 1);
		ag.retornaContato(ag, 2);
		//Geral
		ag.retornaContatos(ag);
		

	}

}
