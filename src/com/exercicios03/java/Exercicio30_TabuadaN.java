package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio30_TabuadaN {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int n = 0, c = 0, t = 0;
		System.out.print("o Montar a tabuada de: ");
		n = scan.nextInt();
		
		do {//Verifica começo menor que o término.
			System.out.print("o Começar por: ");
			c = scan.nextInt();
			System.out.print("o Terminar em: ");
			t = scan.nextInt();
		} while (c>t);
		
		System.out.print("o \no Vou montar a tabuada de "+n+" começando em "+c+" e terminando em "+t+":\n");
		
		for (int i = c; i <= t; i++) {
			System.out.println("o "+n+" x "+i+" = "+n*i);
		}
	}
}
