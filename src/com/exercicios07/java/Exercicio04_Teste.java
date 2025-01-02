package com.exercicios07.java;

public class Exercicio04_Teste {
	public static void main(String[] args) {
		Exercicio04_JogoVelha velha = new Exercicio04_JogoVelha();						
		
		velha.limparTabuleiro();
		velha.executarJogadas();
		velha.verificarCampeao();
	}
}
