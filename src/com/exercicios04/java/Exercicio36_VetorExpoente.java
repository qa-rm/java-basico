package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Exercicio36_VetorExpoente {
	private static Scanner scan;
	private static DecimalFormat formatDouble;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatDouble = new DecimalFormat("###,###,##0.00");
		
		double[] A = new double[11];
		int j = 0;
		
		for (double i : A) {
			i+= j;
			
			out.print("Vetor A["+(int) i+"] = ");
			A[(int) i] = Math.pow(2,scan.nextFloat());
			
			out.println("Vetor A["+(int) i+"] = "+formatDouble.format(A[(int) i]));
			
			j++;
		}		
	}
}
