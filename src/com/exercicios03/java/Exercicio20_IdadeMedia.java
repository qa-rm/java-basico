package com.exercicios03.java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio20_IdadeMedia {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de pessoas na turma: ");
		int p = scan.nextInt();
		
		Double media = (double) 0;
		for (int i = 1; i <= p; i++) {
			System.out.print("Informe a idade da "+i+"ª pessoa: ");
			media+= scan.nextDouble();
		}
		
		media = media/p;
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		System.out.println("Média: "+formatador.format(media));
		if ((media >= 0) && (media <= 25)) {
			System.out.println("Turma Jovem");
		} else if ((media >= 26) && (media <= 60)) {
			System.out.println("Turma Adulta");
		} else if (media > 60){
			System.out.println("Turma Idosa");
		}

	}

}
