package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio10_TemperaturaFarenheit {

	private static Scanner scan;	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai converter uma temperatura de Celsius para Farenheit");
		System.out.println("Para começar informe a temperatura em Celsius: ");
		Double celsius = scan.nextDouble();

		System.out.println("Farenheit: " + ((9 * (celsius) / 5) + 32) + "°F");


	}

}