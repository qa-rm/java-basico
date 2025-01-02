package com.exercicios01.java;

import java.util.Scanner;

public class Exercicio14_TempoDownload {

	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Este programa vai calcular o tempo aproximado de download (em minutos).");
		System.out.println("Para começar informe o tamanho do arquivo (MB): ");
		Double tamanho1 = scan.nextDouble();
		
		System.out.println("Agora, informe a velocidade do link de internet (Mbps): ");
		Double velocidade1 = scan.nextDouble();
		
		System.out.println("Tempo de Download: " + ((tamanho1 / (velocidade1 / 8)) / 60) + " Minutos");

	}

}
