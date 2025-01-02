package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio34_RelacaoPares {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("\n\rVetor A["+i+"] = ");
			A[i] = scan.nextInt();
			
			out.println("Relação de pares até "+A[i]+":");
			
			for (int k = 0; k <= A[i]; k++) {
				if (k%2 == 0) {
					out.print(k+" ");			
				};
			}
			
			j++;
		}		
	}
}
