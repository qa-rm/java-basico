package com.exercicios03.java;

import java.util.Scanner;

public class Exercicio08_SomaMedia {

	private static Scanner scan;	
	
	public static void main(String[] args) {		
		scan = new Scanner(System.in);			
		Double Soma = (double) 0;		
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Informe o número "+i+":");
			Double n = scan.nextDouble();
			Soma+= n;
		}
		
		Double Media = Soma/5;
		System.out.println("Soma: " + Soma);
		System.out.println("Média: " + Media);
	
	}
}