package com.exercicios09.java;

import java.util.Scanner;

public class Exer04 {
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double n = scan.nextDouble();
		
		System.out.println("O valor de metro para pes: "+ConversaoDeUnidadesDeArea.metro2pes(n));
		System.out.println("O valor de pes para metro: "+ConversaoDeUnidadesDeArea.pes2metro(n));
		System.out.println("O valor de pes para cm: "+ConversaoDeUnidadesDeArea.pes2cm(n));
		System.out.println("O valor de cm para pes: "+ConversaoDeUnidadesDeArea.cm2pes(n));
		System.out.println("O valor de mi para acre: "+ConversaoDeUnidadesDeArea.mi2acre(n));
		System.out.println("O valor de acre para mi: "+ConversaoDeUnidadesDeArea.acre2mi(n));
		System.out.println("O valor de acre para pes: "+ConversaoDeUnidadesDeArea.acre2pes(n));
		System.out.println("O valor de pes para acre: "+ConversaoDeUnidadesDeArea.pes2acre(n));	

	}

}
