package com.exercicios04.java;

import static java.lang.System.out;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio16_Quinze {
	private static Scanner scan;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		formatFloat = new DecimalFormat("###,###,##0.00");
		
		int[] A = new int[10];
		int[] Quinze = new int[3];
		int[] Cont15 = new int[Quinze.length];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt();
			
			if (A[i] < 15) {
			    Quinze[0]+= A[i];
			    Cont15[0]++; 
			} else if (A[i] == 15) {
			    Quinze[1]+= A[i];
			    Cont15[1]++; 
			} else if (A[i] > 15) {
				Quinze[2]+= A[i];
				Cont15[2]++; 
			}			
			
			j++;
		}
		
		out.println("a) a soma de elementos armazenados neste vetor que são inferiores a 15: " + Quinze[0]);
		out.println("b) a quantidade de elementos armazenados no vetor que são iguais a 15: " + Cont15[1]);
		out.println("c) a média dos elementos armazenados no vetor que são superiores a 15: " + formatFloat.format((double) Quinze[2]/Cont15[2]));
	}
}
