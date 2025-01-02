package com.exercicios09.java;

public class Exer01 {

	public static void main(String[] args) {
		Contador.mostrarContador();
		
		Contador.incrementaContador();
		Contador.mostrarContador();
		
		Contador.zerarContador();
		Contador.mostrarContador();
		
		Contador.incrementaContador();//0+1	
		new Contador();//1+1
		new Contador();//2+1
		Contador.mostrarContador();//3
	}

}
