package com.rafael.java;

import static java.lang.System.out;

import java.util.Scanner;

public class MatrizIrregular {

	private static Scanner scan;

	public static void main(String[] args) {
		/*Escreva um programa para guardar dados de uma
		 * pesquisa feita com uma amostra de pessoas da
		 * avenida mais movimentada da cidade onde você
		 * mora.
		 * 
		 * A pesquisa consiste em perguntar ao cidadão a
		 * quantidade de filhos e o nome de cada filho.
		 * Guarde essas informações em uma matriz de forma
		 * que cada pessoa entrevistada ocupe somente o
		 * espaço necessário na memória para guardar os
		 * nomes dos filhos.
		 * 
		 * Imprima a quantidade de pessoas entrevistadas,
		 * a quantidade de filhos de cada entrevistado e
		 * os respectivos nomes dos filhos.
		 * */
		
		scan = new Scanner(System.in);
		out.println("Entre com o número de pessoas que serão entrevistados: ");
		int numEntrevista = scan.nextInt();
		
		String[][] nomeFilho = new String[numEntrevista][];
		
		for (int i = 0; i < nomeFilho.length; i++) {
			out.println("Entre com a quantidade de filhos: ");
			int qtdFilho = scan.nextInt();
			
			nomeFilho[i] = new String[qtdFilho];//*
			
			for (int j = 0; j < nomeFilho[i].length; j++) {
				out.println("Digite o nome do filho " + (j + 1));
				
				nomeFilho[i][j] = scan.next();
			}
		}
		
		for (int i = 0; i < nomeFilho.length; i++) {
			out.println("Pessoa " + i + " tem " + nomeFilho[i].length + " filhos");
			for (int j = 0; j < nomeFilho[i].length; j++) {
				out.println(nomeFilho[i][j]);
			}
		}

	}

}
