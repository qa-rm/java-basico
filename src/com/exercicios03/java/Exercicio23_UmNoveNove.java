package com.exercicios03.java;

import java.text.DecimalFormat;

public class Exercicio23_UmNoveNove {

	private static Double p;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		formatFloat = new DecimalFormat("0.00");
		
		p = 1.99;
		Double valor = (double) 0;
		
		System.out.print("o Lojas Quase Dois - Tabela de preços:\n");
		for (int i = 0; i < 50; i++) {
			valor+= p;
			System.out.println("o "+(i+1)+" – R$ "+formatFloat.format(valor));
		}

	}

}
