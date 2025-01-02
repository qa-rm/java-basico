package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio09_Decrescente {

	private static Scanner sc;

	public static void main(String[] args) {

		   int cont = 1;
		   int[] vet = new int[3];

		   sc = new Scanner(System.in);
		   for (int i = 0; i < vet.length; i++){  
			   System.out.print("Digite "+cont+"° número: \t");
		       vet[i] = sc.nextInt();
		       cont++;
		   }

		   for (int i = 1; i < vet.length; i++) {
		       for (int j = 0; j < i; j++) {
		           if (vet[i] > vet[j]) {
		               int aux = vet[i];
		               vet[i] = vet[j];
		               vet[j] = aux;
		           }
		       	}
		   }
		   
		   System.out.println("Array em ordem decrescente:");
		   for (int n : vet) {
			   System.out.print(n + " ");
		   }
	}

}
