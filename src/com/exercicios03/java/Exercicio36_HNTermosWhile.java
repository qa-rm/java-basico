package com.exercicios03.java;

import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;

public class Exercicio36_HNTermosWhile {
	private static DecimalFormat formatFloat;
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.000");
		
		out.print("N: "); int n = scan.nextInt();		
		int i = 1, m = 1;
		Double soma = (double) 0;
		String serie = "o H = ";		
		while (i <= n) {
			if (i == n){
				serie+= m+"/"+i+" = ";
			} else if (i == 1) {
				serie+= m+" + ";
			} else {
				serie+= m+"/"+i+" + ";
			}
			soma+= ((double)m/i);
			i++;
		}		
		out.print(serie+formatFloat.format(soma));
	}
}
