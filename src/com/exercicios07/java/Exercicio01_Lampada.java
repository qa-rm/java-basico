package com.exercicios07.java;

import static java.lang.System.out;

public class Exercicio01_Lampada {
	String garantia;
	String soquete;
	String potencia;
	String tipo;
	String alimentacao;
	Double preco;
	Integer vidaUtil;
	Boolean estado;
	
	void ligar() {
		estado = true;
		out.println("A lâmpada está ligada!!");
	}
	
	void desligar() {
		estado = false;
		out.println("A lâmpada está desligada!!");
	}
}
