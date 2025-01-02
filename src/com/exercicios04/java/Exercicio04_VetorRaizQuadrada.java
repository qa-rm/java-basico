package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Exercicio04_VetorRaizQuadrada {
	private static Scanner scan;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0");
		
		int[] A = new int[15];
		double[] B = new double[A.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			B[i] = Math.sqrt(A[i]);
			
			out.println("Vetor A["+i+"] = "+A[i]+"/ Vetor B["+i+"] = "+formatFloat.format(B[i]));
			
			j++;
		}
		
	}

}
