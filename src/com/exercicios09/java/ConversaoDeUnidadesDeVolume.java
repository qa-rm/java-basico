package com.exercicios09.java;

public class ConversaoDeUnidadesDeVolume {
	/*
	 * 5. Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para
	 * conversão das unidades de volume segundo a lista abaixo. • 1 litro = 1000
	 * centímetros cúbicos • 1 metro cúbico = 1000 litros • 1 metro cúbico = 35.32
	 * pés cúbicos • 1 galão americano = 231 polegadas cúbicas • 1 galão americano =
	 * 3.785 litros
	 */
	
	public static double litro2cm(double n) {
		return n * 1000;
	}
	
	public static double cm2litro(double n) {
		return n / 1000;
	}
	
	public static double m2litro(double n) {
		return n * 1000;
	}
	
	public static double litro2m(double n) {
		return n / 1000;
	}
	
	public static double m2pes(double n) {
		return n * 35.32;
	}
	
	public static double pes2m(double n) {
		return n / 35.32;
	}
	
	public static double galao2polegada(double n) {
		return n * 231;
	}
	
	public static double polegada2galao(double n) {
		return n / 231;
	}
	
	public static double galao2litro(double n) {
		return n * 3785;
	}
	
	public static double litro2galao(double n) {
		return n / 3785;
	}
}
