package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio11_InteiroReal {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa 2 números inteiros e um número real vai: \r\n" +
						   "a. o produto do dobro do primeiro com metade do segundo .\r\n" + 
						   "b. a soma do triplo do primeiro com o terceiro.\r\n" + 
						   "c. o terceiro elevado ao cubo ");
		System.out.println("Para começar informe 2 inteiros: ");
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();
		
		System.out.println("Agora informe 1 número real: ");
		Double real1 = scan.nextDouble();

		System.out.println("a: " + ((int1 * 2) * (int2 / 2)));
		System.out.println("b: " + ((int1 * 3) + real1));
		System.out.println("c: " + (Math.pow(real1, 3)));

	}

}
