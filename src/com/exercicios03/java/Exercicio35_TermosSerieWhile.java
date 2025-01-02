package com.exercicios03.java;

import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;

public class Exercicio35_TermosSerieWhile {
	private static DecimalFormat formatFloat;
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.000");
		
		out.print("n: "); int n = scan.nextInt();		
		int i = 1, m = 1;
		Double soma = (double) 0;
		String serie = "o S = ";		
		while (i <= n) {
			if (i == n){
				serie+= i+"/"+m+" = ";
			} else {
				serie+= i+"/"+m+" + ";
			}
			soma+= ((double)i/m);
			m+=2;
			i++;
		}		
		out.print(serie+formatFloat.format(soma));
	}
}
