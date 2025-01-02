package com.exercicios05.java;

import java.util.Scanner;
import static java.lang.System.out;

public class Exercicio03_ParImpar {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[][] M = new int[3][3];
		int par = 0, impar = 0;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				out.print("Preencha a posição["+i+"]["+j+"]: ");
				M[i][j] = scan.nextInt();
				
				if ((M[i][j] % 2) == 0) {
					par+= 1;
				} else {
					impar+= 1;
				}
			}
		}
		
		for(int i = 0; i<M.length; i++){
			for(int j = 0; j<M[i].length; j++){
			out.print(M[i][j] + "["+i+"]" + "["+j+"]" + " ");
			}
			out.println(" ");
		}
		
		out.print("\nQuantidade de números pares: "+par);
		out.print("\nQuantidade de números ímpares: "+impar);
	}

}
