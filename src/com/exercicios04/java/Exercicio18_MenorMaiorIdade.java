package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio18_MenorMaiorIdade {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);	
		
		int[] A = new int[10];
		int maior = 0, menor = 0, pmaior = 0, pmenor = 0, j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Idade["+i+"] = ");
			A[i] = scan.nextInt();
			
			if (j == 0) {
				maior = A[i];
				menor = A[i];
				pmaior = i;
				pmenor = i;
			}
			
			if (A[i] >= maior) {
				maior = A[i];
				pmaior = i;
			} else if (A[i] < maior) {
				if (A[i] <= menor) {
					menor = A[i];
					pmenor = i;
				}
			}		
			
			j++;
		}
		
		out.println("Menor e a maior idades e suas respectivas posições: " + menor + "[" + pmenor + "] / " + maior + "[" + pmaior + "]");
	}
}
