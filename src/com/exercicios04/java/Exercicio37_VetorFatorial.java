package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio37_VetorFatorial {
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[15];
		int[] B = new int[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			B[i] = A[i];
			
			if (B[i] == 0) {
				B[i]++;
			}
			
			for (int j2 = B[i] -1; j2 > 1; j2--) {
				B[i]*= j2; 
			}
			
			out.println("Fatorial de !"+A[i]+" = "+B[i]);
			
			++j;
		}		
	}
}
/* Algoritmo fatorial iterativo
 * int fatorial (int numero) { int resultado = numero; if (numero == 0)
 * resultado++; while (numero > 1) resultado *= --numero; return resultado; }
 */