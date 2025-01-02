package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio28_InverterTrasFrente {
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
			
			B[-1+B.length-i] = A[i];
			
			j++;
		}
		
		out.println("Vetor A = "+Arrays.toString(A)+"\nVetor B = "+Arrays.toString(B));
	}
}
