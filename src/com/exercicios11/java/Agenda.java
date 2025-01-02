package com.exercicios11.java;

public class Agenda {
	private Contato[] contatos;
	private String nome;
	
	public Contato[] getContatos() {
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void retornaContato(Agenda a, int i) {
		System.out.println("Nome: "+a.contatos[i].getNome());
		System.out.println("Telefone: "+a.contatos[i].getTelefone());
		System.out.println("Email: "+a.contatos[i].getEmail());
	}
	
	public void retornaContatos(Agenda a) {
		if (a!=null && a.getContatos()!=null) {
			for (Contato c : a.getContatos()) {
				System.out.println("Contato: "+c.getNome()+" "+c.getTelefone()+" "+c.getEmail());
			}
		}
	}
}
