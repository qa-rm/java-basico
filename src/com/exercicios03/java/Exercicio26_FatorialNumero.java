package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio26_FatorialNumero {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		int n = scan.nextInt();
		System.out.println("o Fatorial de: "+n);
		
		int calculo = n;		
		if (n == 0) calculo++;		
				
		String fim;
		fim = "o "+ n + "! = "+n+" . ";
		
		n-=1;
		do {		
			if (n > 1) {
				fim+= n + " . ";
			} else fim+= n;
			
			calculo*= n--;
		} while (n > 0);
	
		System.out.println(fim + " = " + calculo);
	}
}