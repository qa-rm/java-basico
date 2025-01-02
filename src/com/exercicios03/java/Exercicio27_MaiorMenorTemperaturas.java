package com.exercicios03.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio27_MaiorMenorTemperaturas {

	private static DecimalFormat temperatura;
	private static Scanner scan;

	public static void main(String[] args) {
		temperatura = new DecimalFormat("0.00°C");
		scan = new Scanner(System.in);
		
		System.out.println("Departamento Estadual de Meteorologia");
		System.out.println("Temperaturas a serem lidas: ");
		int n = scan.nextInt();
		
		Double total = (double) 0, atual = (double) 0, maior = (double) 0, menor = (double) 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Temperatura "+ (i+1) +": ");
			atual = scan.nextDouble();
			
			if (i == 0) {
				maior = atual;
				menor = atual;
			}
			
			if (atual >= maior) {
				maior = atual;
			} else if (atual < maior) {
				if (atual <= menor) {
					menor = atual;
				}
			}
			
			total+= atual; 
		}//fim for
		
		System.out.println("\n\rMaior temperatura: " + temperatura.format(maior));
		System.out.println("Menor temperatura: " + temperatura.format(menor));
		System.out.println("Média das temperaturas: " + temperatura.format(total/n));
	}

}
