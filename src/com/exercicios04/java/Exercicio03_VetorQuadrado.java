package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio03_VetorQuadrado {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[15];
		int[] B = new int[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			B[i] = A[i] * A[i];
			
			out.println("Vetor A["+i+"] = "+A[i]+"/ Vetor B["+i+"] = "+B[i]);
			
			j++;
		}
		
	}
}
