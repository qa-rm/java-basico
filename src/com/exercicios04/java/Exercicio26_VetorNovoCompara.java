package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio26_VetorNovoCompara {
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
			
			if (A[i] > B[i]) {
				C[i] = 1;
			} else if (A[i] == B[i]) {
				C[i] = 0;
			} else if (A[i] < B[i]) {
				C[i] = -1;
			}
			
			out.println("Vetor A["+i+"] ("+A[i]+") ¨ Vetor B["+i+"] ("+B[i]+") ¨ Vetor C["+i+"] ("+C[i]+")");
			
			j++;
		}		
	}
}
