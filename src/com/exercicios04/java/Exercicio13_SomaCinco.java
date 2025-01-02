package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio13_SomaCinco {
	private static Scanner scan;

	public static void main(String[] args) {	
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int j = 0, cont = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			
			if ((A[i] % 5) == 0) {
			    cont+=A[i]; 
			}
			
			j++;
		}
		
		out.println("Soma acumulada no vetor A[10] múltiplos de 5: " + cont);	
	}
}
