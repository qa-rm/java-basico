package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio33_VetorNumeroPrimo {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[5];
		int j = 0, primo = 0;
		
		for (int i : A) {
			i+= j;
			primo = 0;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			
			for (int k = 1; k <= A[i]; k++) {
				if (A[i]%k == 0) {
					primo++;				
				};
			}
			 
			if (primo == 2)
				System.out.println("O número "+A[i]+" é Primo");
			else
				System.out.println("O número "+A[i]+" Não é Primo");
			
			j++;
		}		
	}
}
