package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio02_NomeSenha {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String nome;
		String senha;
		do {
			System.out.println("Digite o nome e senha: ");
			nome = scan.next();
			senha = scan.next();
			
			if (nome.trim().equals(senha)) {
				System.out.println("Erro.");
			}
		} while (nome.trim().equals(senha));
		System.out.println("Muito bem.");
	}
}
