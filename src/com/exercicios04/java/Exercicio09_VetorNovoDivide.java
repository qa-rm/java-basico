package com.exercicios04.java;

import static java.lang.System.out;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09_VetorNovoDivide {
	private static Scanner scan;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.00");
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		double[] C = new double[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			out.print("Vetor B["+i+"] = ");
			B[i] = scan.nextInt();
			
			C[i] = A[i] / (float) B[i];
			
			out.println("Vetor A["+i+"] ("+A[i]+") x Vetor B["+i+"] ("+B[i]+") = Vetor C["+i+"] ("+formatFloat.format(C[i])+")\n");
			
			j++;
		}		
	}
}
