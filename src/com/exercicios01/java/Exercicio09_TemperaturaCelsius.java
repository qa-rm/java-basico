package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio09_TemperaturaCelsius {

	private static Scanner scan;		
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai converter uma temperatura de Farenheit para Celsius");
		System.out.println("Para começar informe a temperatura em Farenheit: ");
		Double farenheit = scan.nextDouble();

		System.out.println("Celsius: " + (5 * (farenheit - 32) / 9) + "°C");


	}

}
