package com.exercicios03.java;

import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;

public class Exercicio33_TermosSerieFor {//(n/m)
	private static DecimalFormat formatFloat;
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.000");
		
		out.print("n: "); int n = scan.nextInt();		
		int m = 1;
		Double soma = (double) 0;
		String serie = "o S = ";		
		for (int i = 1; i <= n; i++) {
			if (i == n){
				serie+= i+"/"+m+" = ";
			} else {
				serie+= i+"/"+m+" + ";
			}
			/*
			( i / m ) é uma divisão de inteiros.
			O java faz o cast pra double que arrendonda pra baixo (0) devido ao resultado... quando é feito a multiplicação: 0 x 100 = 0.
			O cast de pelo menos um dos operadores resolve
			*/
			soma+= ((double)i/m);
			m+=2;
		}		
		out.print(serie+formatFloat.format(soma));
	}
}
/* Outra forma de fazer o exercício
 * public class Exer33{
 *   public static void main (String[] args){
 *     Scanner scan = new Scanner(System.in);
 *     
 *     System.out.println("Digite o valor de n");
 *     int n = scan.nextInt();
 *     double soma = 0;
 *     
 *     for (int i=1, j=1; i<=n; i++, j++){
 *       System.out.print(i + "/" + j + " + ");
 *       soma += i/j;
 *     }
 *     
 *     System.out.println("\nSoma = " + soma);
 *   }
 * }*/