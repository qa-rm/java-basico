package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio17_Idades {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		
		int[] A = new int[10];
		int qtde = 0, j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Idade["+i+"] = ");
			A[i] = scan.nextInt();
			
			if (A[i] > 35) {
			    qtde++; 
			}		
			
			j++;
		}
		
		out.println("Quantidade de pessoas que possuem idade superior a 35 anos: " + qtde);
	}
}
