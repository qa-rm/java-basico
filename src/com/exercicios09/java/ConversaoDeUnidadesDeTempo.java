package com.exercicios09.java;

public class ConversaoDeUnidadesDeTempo {
	/*
	 * 6. Escreva a classe ConversaoDeUnidadesDeTempo com métodos estáticos para
	 * conversão aproximada das unidades de velocidade segundo a lista abaixo. • 1
	 * minuto = 60 segundos • 1 hora = 60 minutos • 1 dia = 24 horas • 1 semana = 7
	 * dias • 1 mês = 30 dias • 1 ano = 365.25 dias
	 */
	
	public static double mm2ss(double n) {
		return n * 60;
	}
	
	public static double ss2mm(double n) {
		return n / 60;
	}
	
	public static double HH2mm(double n) {
		return n * 60;
	}
	
	public static double mm2HH(double n) {
		return n / 60;
	}
	
	public static double dd2HH(double n) {
		return n * 24;
	}
	
	public static double HH2dd(double n) {
		return n / 24;
	}
	
	public static double semana2dd(double n) {
		return n * 7;
	}
	
	public static double dd2semana(double n) {
		return n / 7;
	}
	
	public static double mes2dia(double n) {
		return n * 30;
	}
	
	public static double dia2mes(double n) {
		return n / 30;
	}

	public static double ano2dia(double n) {
		return n * 365.25;
	}
	
	public static double dia2ano(double n) {
		return n / 365.25;
	}
	
}
