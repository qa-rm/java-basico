package com.exercicios09.java;

import java.util.Scanner;

public class Exer06 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double n = scan.nextDouble();

        System.out.println("O valor de minuto para segundo: "+ConversaoDeUnidadesDeTempo.mm2ss(n));
		System.out.println("O valor de segundo para minuto: "+ConversaoDeUnidadesDeTempo.ss2mm(n));
		System.out.println("O valor de hora para minuto: "+ConversaoDeUnidadesDeTempo.HH2mm(n));
		System.out.println("O valor de minuto para hora: "+ConversaoDeUnidadesDeTempo.mm2HH(n));
		System.out.println("O valor de dia para hora: "+ConversaoDeUnidadesDeTempo.dd2HH(n));
		System.out.println("O valor de hora para dia: "+ConversaoDeUnidadesDeTempo.HH2dd(n));
		System.out.println("O valor de semana para dia: "+ConversaoDeUnidadesDeTempo.semana2dd(n));
		System.out.println("O valor de dia para semana: "+ConversaoDeUnidadesDeTempo.dd2semana(n));
		System.out.println("O valor de mês para dia: "+ConversaoDeUnidadesDeTempo.mes2dia(n));
		System.out.println("O valor de dia para mês: "+ConversaoDeUnidadesDeTempo.dia2mes(n));
		System.out.println("O valor de ano para dia: "+ConversaoDeUnidadesDeTempo.ano2dia(n));
		System.out.println("O valor de dia para ano: "+ConversaoDeUnidadesDeTempo.dia2ano(n));
	}

}
