package com.exercicios10.java;

public class Fibonacci {
	
	private static int termo = 0, ant = 0, atu = 0, i = 0;
	
	public static int nesimoTermo(int n) {	
		if (i == 2) {
			atu = 1;
		}
		
		if (n == i) {
			return termo;
		}
				
		termo=ant+atu;
		ant=atu;
		atu=termo;
		
		i++;
		
		return nesimoTermo(n);
	}
	
	/*
	 * public static int solucaoLoiane(int num) { if (num < 2) { return 1; }
	 * 
	 * return solucaoLoiane(num-1) + solucaoLoiane(num-2); }
	 */
}
