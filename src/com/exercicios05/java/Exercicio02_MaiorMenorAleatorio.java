package com.exercicios05.java;

import static java.lang.System.out;

import java.util.Random;

public class Exercicio02_MaiorMenorAleatorio {
	public static void main(String[] args) {
		Random random = new Random(); 
		
		int[][] M = new int[10][10];
		int maiorl5 = 0, menorl5 = 0,
			maiorc7 = 0, menorc7 = 0;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = random.nextInt(10);
			
				if (i == 4 && j == 0) {
					maiorl5 = M[i][j];
					menorl5 = M[i][j];	
				}
				
				if (i == 4) {
					if (M[i][j] >= maiorl5) {
						maiorl5 = M[i][j];
					} else if (M[i][j] < maiorl5) {
						if (M[i][j] <= menorl5) {
							menorl5 = M[i][j];
						}
					}
				}
				
				if (i == 0 && j == 6) {
					maiorl5 = M[i][j];
					menorl5 = M[i][j];	
				}
				
				if (j == 6) {		
					if (M[i][j] >= maiorc7) {
						maiorc7 = M[i][j];
					} else if (M[i][j] < maiorc7) {
						if (M[i][j] <= menorc7) {
							menorc7 = M[i][j];
						}
					}
				}
			}
		}		
		
		for(int i = 0; i<M.length; i++){
			for(int j = 0; j<M[i].length; j++){
			out.print(M[i][j] + "["+i+"]" + "["+j+"]" + " ");
			}
			out.println(" ");
		}
		
		out.print("\nMaior Número da Linha 5: "+maiorl5+"\nMenor Número da Linha 5: "+menorl5);
		out.print("\nMaior Número da Coluna 7: "+maiorc7+"\nMenor Número da Coluna 7: "+menorc7);
	}	
}
