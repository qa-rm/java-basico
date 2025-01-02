package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio27_IntCharDoisVetor {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		char[] B = new char[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			
			if (A[i] < 7) {
				B[i] = 'a';
			} else if (A[i] == 7) {
				B[i] = 'b';
			} else if ((A[i] > 7) && (A[i] < 10)) {
				B[i] = 'c';
			} else if (A[i] == 10) {
				B[i] = 'd';
			} else if (A[i] > 10) {
				B[i] = 'e';
			}
			
			out.println("Vetor A["+i+"] = "+A[i]+" ¨ Vetor B["+i+"] = "+B[i]);
			
			j++;
		}		
	}
}
