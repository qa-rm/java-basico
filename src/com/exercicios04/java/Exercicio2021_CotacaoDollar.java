package com.exercicios04.java;

import static java.lang.System.out;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2021_CotacaoDollar {
	private static Scanner scan;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.00");
		
		float[] A = new float[20];
		float cotacao = (float) 5.22;//Data 02/08/2020
		int j = 0;		
		
		for (float i : A) {			
			i+= j; //valor do vetor [i] = [A] sendo sobscrito
			
			out.print("Dollar["+(int) (i+1)+"] = ");
			A[(int) i] = scan.nextFloat();
			
			A[(int) i] = cotacao * A[(int) i];
			out.println("Real: R$ " + formatFloat.format(A[(int) i]));
			
			j++;
		}		
	}
}