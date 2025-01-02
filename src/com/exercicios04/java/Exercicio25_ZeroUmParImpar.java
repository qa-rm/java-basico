package com.exercicios04.java;

import static java.lang.System.out;

import java.util.Scanner;

public class Exercicio25_ZeroUmParImpar {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			
			if ((A[i]%2) == 0) {
				B[i] = 1;
			} else {
				B[i] = 0;
			}
			
			out.println("Vetor A["+i+"] = "+A[i]+" ¨ Vetor B["+i+"] = "+B[i]);
			
			j++;
		}		
	}
}
