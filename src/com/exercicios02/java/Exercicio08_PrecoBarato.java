package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio08_PrecoBarato {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe o preço de três produtos: ");
		Double prod1 = scan.nextDouble();
		Double prod2 = scan.nextDouble();
		Double prod3 = scan.nextDouble();

		Double menorPreco = (double) 0;
		String escolha = "produto que escolher, ambos têm o mesmo preço";
		
		if (prod1 < prod2) {
			menorPreco = prod1;
			escolha = "Produto 1";
		} else if (prod2 < prod1) {
			menorPreco = prod2;
			escolha = "Produto 2";
		}
		
		if (prod3 < menorPreco) {
			menorPreco = prod3;
			escolha = "Produto 3";
		}
		
		
		System.out.println("Você deve comprar o " + escolha);
	}

}
