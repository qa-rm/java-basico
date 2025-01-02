package com.exercicios03.java;

public class Exercicio09_CinquentaImpar {
	public static void main(String[] args) {
		for (int i = 1; i <= 50; i++) {
			int n = i%2;
			
			if (n != 0) {
				System.out.println(i);
			};		
		}
	}
}
