package com.exercicios04.java;

import static java.lang.System.out;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio30_ParImparRespectivos {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[20];
		int[] B = new int[A.length];
		int[] C = new int[B.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			
			if ((A[i]%2) == 0) {
				B[i] = A[i];
				C[i] = -1;
			} else if ((A[i]%2) != 0) {
				C[i] = A[i];
			}			
			
			j++;
		}
				
		out.println("Par(B) = "+Arrays.toString(B)+"\nÍmpar(C) = "+Arrays.toString(C));
	}
}
