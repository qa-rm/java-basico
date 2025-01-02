package com.exercicios10.java;

public class Somatorio {
	private static int soma = 0;

	public static int somatoria(int n) {
		if (n == 0) {
			return n + soma;
		}

		soma += n;

		return somatoria(n - 1);
	}

	
	/*
	 * public static int solucaoLoiane(int num) { if (num == 1) { return 1; }
	 * 
	 * return num + solucaoLoiane(num-1); }
	 */
	 
}
