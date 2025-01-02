package com.exercicios09.java;

import java.util.Scanner;

public class Exer05 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double n = scan.nextDouble();
		
		System.out.println("O valor de litro para centimetro: "+ConversaoDeUnidadesDeVolume.litro2cm(n));
		System.out.println("O valor de centimetro para litro: "+ConversaoDeUnidadesDeVolume.cm2litro(n));
		System.out.println("O valor de metro para litro: "+ConversaoDeUnidadesDeVolume.m2litro(n));
		System.out.println("O valor de litro para metro: "+ConversaoDeUnidadesDeVolume.litro2m(n));
		System.out.println("O valor de metro para pes: "+ConversaoDeUnidadesDeVolume.m2pes(n));
		System.out.println("O valor de pes para metro: "+ConversaoDeUnidadesDeVolume.pes2m(n));
		System.out.println("O valor de galão para polegada: "+ConversaoDeUnidadesDeVolume.galao2polegada(n));
		System.out.println("O valor de polegada para galão: "+ConversaoDeUnidadesDeVolume.polegada2galao(n));
		System.out.println("O valor de galão para litro: "+ConversaoDeUnidadesDeVolume.galao2litro(n));
		System.out.println("O valor de litro para galão: "+ConversaoDeUnidadesDeVolume.litro2galao(n));
	}

}
