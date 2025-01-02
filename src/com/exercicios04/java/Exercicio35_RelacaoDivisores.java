package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio35_RelacaoDivisores {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("\n\rVetor A["+i+"] = ");
			A[i] = scan.nextInt();
			
			out.println("Relação de divisores do número "+A[i]+":");
			
			for (int k = 1; k <= A[i]; k++) {
				if (A[i]%k == 0) {
					out.print(k+" ");			
				};
			}
			
			j++;
		}		
	}
}
