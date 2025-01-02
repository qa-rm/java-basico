package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio15_PercentualParImpar {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int j = 0, cont = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			
			if ((A[i]%2) == 0) {
			   cont++; 
			}
			
			j++;
		}
		
		out.println("Porcentagem de Pares no vetor A[10]: " + (cont*100)/A.length + "%");//fórmula porcentagem
		out.println("Porcentagem de Ímpares no vetor A[10]: " + (10-cont)*10 + "%");
	}
}
