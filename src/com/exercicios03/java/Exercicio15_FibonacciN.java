package com.exercicios03.java;

import java.util.Scanner;

/*#include <stdio.h>

main(){

	int N, num, numA, numB, i;

	printf("Digite quantos termos devem aparecer.\n");

	scanf("%d", &N);

	numA=1;numB=0;i=0;

	while(i<N){

	printf("%d, ", numA);

	num=numA+numB;

	numB=numA;

	numA=num;

	i++;}

}*/

public class Exercicio15_FibonacciN {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int N, num, numA = 1, numB = 0, i = 0;
		
		System.out.print("Digite quantos termos devem aparecer.\n");
		N = scan.nextInt();

		while (i<N) {
			System.out.print(numA + " ");

			num=numA+numB;

			numB=numA;

			numA=num;

			i++;	
		}
	}

}
