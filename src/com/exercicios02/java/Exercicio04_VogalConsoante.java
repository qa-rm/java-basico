package com.exercicios02.java;

import java.util.Scanner;

public class Exercicio04_VogalConsoante {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		String letra = scan.next();
		
		switch (letra.toLowerCase()){
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": System.out.println("Vogal"); break;
		default: System.out.println("Consoante"); break;
		}
		
	}

}
