package com.exercicios05.java;

import static java.lang.System.out;
import java.util.Random;

public class Exercicio01_MaiorAleatorio {
	public static void main(String[] args) {
		Random random = new Random(); 
		
		int[][] M = new int[4][4];
		int maior = 0, ipmaior = 0, jpmaior = 0;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(10);
			
				if (i == 0 && j == 0) {
					maior = M[i][j];
					ipmaior = i;
					jpmaior = j;
				}
				
				if (M[i][j] >= maior) {
					maior = M[i][j];
					ipmaior = i;
					jpmaior = j;
				}	
			}
		}		
		
		for(int i = 0; i<M.length; i++){
			for(int j = 0; j<M[i].length; j++){
			out.print(M[i][j] + "["+i+"]" + "["+j+"]" + " ");
			}
			out.println(" ");
		}
		
		out.print("Maior Número: "+maior+" - Posição: ["+ipmaior+"]["+jpmaior+"]");
	}	
}
