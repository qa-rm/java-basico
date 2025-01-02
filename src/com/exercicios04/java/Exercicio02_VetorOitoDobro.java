package com.exercicios04.java;

import java.util.Scanner;
import static java.lang.System.out;

public class Exercicio02_VetorOitoDobro {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[8];
		int[] B = new int[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			B[i] = A[i] * 2;
			
			out.println("Vetor A["+i+"] = "+A[i]+"/ Vetor B["+i+"] = "+B[i]);
			
			j++;
		}

	}

}
