package com.exercicios03.java;

import java.text.DecimalFormat;

public class Exercicio24_Panificadora {

	private static Double p;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		formatFloat = new DecimalFormat("0.00");
		
		p = 0.18;
		Double valor = (double) 0;
		
		System.out.print("o Preço do pão: R$ 0,18\r\n" + 
						 "o Panificadora Pão de Ontem - Tabela de preços:\n");
		for (int i = 0; i < 50; i++) {
			valor+= p;
			System.out.println("o "+(i+1)+" – R$ "+formatFloat.format(valor));
		}

	}

}
