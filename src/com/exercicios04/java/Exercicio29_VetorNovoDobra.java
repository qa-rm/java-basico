package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio29_VetorNovoDobra {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length+B.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			out.print("Vetor B["+i+"] = ");
			B[i] = scan.nextInt();
			
			C[i] = A[i];
			C[B.length+i] = B[i];
			
			j++;
		}
				
		out.println("Vetor C = "+Arrays.toString(C));
	}
}
