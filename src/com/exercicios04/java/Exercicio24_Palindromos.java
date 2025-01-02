package com.exercicios04.java;

import static java.lang.System.out;

import java.util.Scanner;

public class Exercicio24_Palindromos {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int j = 0;
		boolean flag = true;
		
		for (int i : A) {
			i+= j;
			
			out.print("Digito["+i+"] = ");
			A[i] = scan.nextInt();
			
			switch (i) {
			case 5:
				if (A[i] == A[4]) {
					flag = true;
					j++;	
				} else {
					flag = false;
				}
				break;
			case 6:
				if (A[i] == A[3]) {
					flag = true;
					j++;
				} else {
					flag = false;
				}
				break;
			case 7:
				if (A[i] == A[2]) {
					flag = true;
					j++;
				} else {
					flag = false;
				}
				break;
			case 8:
				if (A[i] == A[1]) {
					flag = true;
					j++;
				} else {
					flag = false;
				}
				break;
			case 9:
				if (A[i] == A[0]) {
					flag = true;
					j++;
				} else {
					flag = false;
				}
				break;
			default:
				flag = true;
				j++;
				break;
			}
			
			if (flag == true) {
				continue;
			}
			
			out.print("O vetor não é palíndromo");
			break;			
		}
		if (flag == true) {
			out.print("O vetor é palíndromo");;
		}
	}
	/* Algoritmo para constatar se um número é Palindromo,
	 * fonte: http://cmaisfacil.blogspot.com/2009/11/um-passo-de-cada-vez-parte-i.html, acesso 08/08/2020
	 * int main(){ int digitado,num,invertido,digito;
	 * printf("Digite numero inteiro: "); scanf("%d",&digitado); num = digitado;
	 * invertido = 0; while(num != 0){ digito = num % 10; invertido = (invertido *
	 * 10) + digito; num = num / 10; } if(digitado == invertido)
	 * printf("Palindromo !!!\n"); else printf("Nao eh Palindromo!!!\n"); system
	 * ("pause"); }
	 */
}
