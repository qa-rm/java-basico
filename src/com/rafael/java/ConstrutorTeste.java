package com.rafael.java;

import static java.lang.System.out;

public class ConstrutorTeste {
	public static void main(String[] args) {
		//**Aqui
		Construtor van = new Construtor();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		//van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		out.println(van.numPassageiros);
		
		Construtor van2 = new Construtor("Fiat", "Ducato", 10, 100, 0.2);
		out.println(van2.marca);
		out.println(van2.modelo);
		out.println(van2.numPassageiros);
		out.println(van2.capCombustivel);
		out.println(van2.consumoCombustivel);
	}
}
