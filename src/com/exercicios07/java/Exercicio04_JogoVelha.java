package com.exercicios07.java;

import static java.lang.System.out;

import java.util.Scanner;

public class Exercicio04_JogoVelha {
	Scanner scan = new Scanner(System.in);
	String[][] tabuleiro = new String[3][3];				
	int player = 1, x = -1, y = -1;
	boolean venceu = false;
	
	void limparTabuleiro() {
		for(int i = 0; i<tabuleiro.length; i++){
			for(int j = 0; j<tabuleiro[i].length; j++){
			tabuleiro[i][j] = " ";
			}
		}
	}
	
	void executarJogadas() {
		do {
			do {
				if (player%2 != 0) {
					out.print("Jogador 1\n");
					out.print("Horizontal: ");
					x = scan.nextInt();
					out.print("Vertical: ");
					y = scan.nextInt();
				} else if (player%2 == 0) {
					out.print("Jogador 2\n");
					out.print("Horizontal: ");
					x = scan.nextInt();
					out.print("Vertical: ");
					y = scan.nextInt();
				}
			} while (((x < 0) && (x > 2)) ||
					 ((y < 0) && (y > 2)));			
			
			if (tabuleiro[x][y] == " ") {
				if (player%2 != 0) {
					tabuleiro[x][y] = "X";
				} else if (player%2 == 0) {
					tabuleiro[x][y] = "O";
				}
				
				player++;
			} else {
				out.print("Posição já está em uso.\n");
			}
			
			for(int i = 0; i<tabuleiro.length; i++){
				for(int j = 0; j<tabuleiro[i].length; j++){
				out.print("["+tabuleiro[i][j]+"]"+ " ");
				}
				out.println(" ");
			} out.println("\n");
			
			if ((tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X")) ||
					(tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X")) || //HORIZONTAL
					(tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X")) ||
						
					(tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O")) ||
					(tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O")) || //HORIZONTAL
					(tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O")) ||				
					
					(tabuleiro[0][0].equals("X") && tabuleiro[1][0].equals("X") && tabuleiro[2][0].equals("X")) ||
					(tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][1].equals("X")) || //VERTICAL
					(tabuleiro[0][2].equals("X") && tabuleiro[1][2].equals("X") && tabuleiro[2][2].equals("X")) ||
					
					(tabuleiro[0][0].equals("O") && tabuleiro[1][0].equals("O") && tabuleiro[2][0].equals("O")) ||
					(tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][1].equals("O")) || //VERTICAL
					(tabuleiro[0][2].equals("O") && tabuleiro[1][2].equals("O") && tabuleiro[2][2].equals("O")) ||
					
					(tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X")) ||
					(tabuleiro[2][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[0][2].equals("X")) || //DIAGONAL
					
					(tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O")) ||
					(tabuleiro[2][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[0][2].equals("O"))     //DIAGONAL
					) {
					venceu = true;
				} else if (player > 9) {
					venceu = true;
				} else {
					venceu = false;
				}
		} while (!venceu);
	}
	
	void verificarCampeao() {
		if (player > 9) {
			out.print("Deu velha!!");
		} else if (player%2 != 0) {
			out.print("Jogador 2 venceu!!");
		} else if (player%2 == 0) {
			out.print("Jogador 1 venceu!!");
		}
	}
}
