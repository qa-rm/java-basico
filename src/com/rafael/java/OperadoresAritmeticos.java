package com.rafael.java;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2;
		System.out.println("Resultado Soma: " + resultado);
		
		resultado = resultado - 1;
		System.out.println("Resultado Subtração: " + resultado);		

		resultado = resultado * 2;
		System.out.println("Resultado Multiplicação: " + resultado);
		
		resultado = resultado / 2;
		System.out.println("Resultado Divisão: " + resultado);
		
		resultado = resultado + 8;
		System.out.println("Resultado Soma 2: " + resultado);
		
		resultado = resultado % 7;
		System.out.println("Resultado Módulo: " + resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma String concatenada.";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado + 1;
		System.out.println(resultado);
		
		resultado++;
		System.out.println(resultado);
		
		//5
		System.out.println(resultado++);
		System.out.println(++resultado);
		
		resultado--;
		System.out.println(resultado);
		System.out.println(resultado--);
		System.out.println(--resultado);
	}

}
