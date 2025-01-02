package com.exercicios09.java;
/**
 *
 * @author Rafael
 */

public class Contador {
	private static int contador = 0;
	
	public Contador() {
		incrementaContador();
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Contador.contador = contador;
	}
	
	public static void incrementaContador() {
		Contador.contador++;
	}
	
	public static void mostrarContador(){
        System.out.println(getContador());
    }
	
	public static void zerarContador() {
		Contador.contador = 0;
	}
	
	
}
