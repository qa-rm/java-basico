package com.exercicios04.java;

import static java.lang.System.out;

import java.util.Scanner;

public class Exercicio06_VetorNovo {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			out.print("Vetor B["+i+"] = ");
			B[i] = scan.nextInt();
			
			C[i] = A[i] + B[i];
			
			out.println("Vetor A["+i+"] ("+A[i]+") + Vetor B["+i+"] ("+B[i]+") = Vetor C["+i+"] ("+C[i]+")");
			
			j++;
		}		
	}
}
