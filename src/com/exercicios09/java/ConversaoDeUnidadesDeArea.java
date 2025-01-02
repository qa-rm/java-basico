package com.exercicios09.java;

public class ConversaoDeUnidadesDeArea {
	/*
	 * 4. Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para
	 * conversão das unidades de área segundo a lista abaixo. • 1 metro quadrado =
	 * 10.76 pés quadrados • 1 pé quadrado = 929 centímetros quadrados • 1 milha
	 * quadrada = 640 acres • 1 acre = 43.560 pés quadrados
	 */
	
	public static double metro2pes(double n) {
		return n * 10.76;
	}
	
	public static double pes2metro(double n) {
		return n / 10.76;
	}
	
	public static double pes2cm(double n) {
		return n * 929;
	}
	
	public static double cm2pes(double n) {
		return n / 929;
	}
	
	public static double mi2acre(double n) {
		return n * 640;
	}
	
	public static double acre2mi(double n) {
		return n / 640;
	}
	
	public static double acre2pes(double n) {
		return n * 43560;
	}
	
	public static double pes2acre(double n) {
		return n / 43560;
	}
}
