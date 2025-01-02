package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio31_ParImparIniFin {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[20];
		int[] B = new int[A.length];
		int j = 0, k = 0, l = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			
			if ((A[i]%2 == 0)) {
				B[l] = A[i];
				l++;
			} else {
				B[-1+B.length-k] = A[i];				
				k++;
			}
			
			j++;
		}
				
		out.println("Vetor C = "+Arrays.toString(B));
	}
}
