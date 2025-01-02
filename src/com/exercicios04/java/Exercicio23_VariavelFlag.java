package com.exercicios04.java;

import static java.lang.System.out;

import java.util.Scanner;

public class Exercicio23_VariavelFlag {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int j = 0;
		boolean flag = true;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor["+i+"] = ");
			A[i] = scan.nextInt()%2;
			
			/*Melhor solução sem flag
			 * if (A[i] == 0) {j++; continue; } break;
			 */
			
			if (A[i] == 0) {
				flag = true;
				j++;
			} else {
				flag = false;
			}
			
			if (flag == true) {
				continue;
			}
			
			break;			
		}		
	}
}
