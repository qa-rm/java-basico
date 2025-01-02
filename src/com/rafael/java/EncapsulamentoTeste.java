package com.rafael.java;

import static java.lang.System.out;

public class EncapsulamentoTeste {

	public static void main(String[] args) {
		Encapsulamento van = new Encapsulamento();
		
		van.setMarca("Fiat");
		
		out.println(van.getMarca());

	}

}
