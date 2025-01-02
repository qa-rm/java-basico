package com.exercicios03.java;

import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;

public class Exercicio34_HNTermosFor {
	private static DecimalFormat formatFloat;
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.000");
		
		out.print("N: "); int n = scan.nextInt();		
		int m = 1;
		Double soma = (double) 0;
		String serie = "o H = ";		
		for (int i = 1; i <= n; i++) {
			if (i == n){
				serie+= m+"/"+i+" = ";
			} else if (i == 1) {
				serie+= m+" + ";
			} else {
				serie+= m+"/"+i+" + ";
			}
			soma+= ((double)m/i);
		}		
		out.print(serie+formatFloat.format(soma));
	}
}
/* Outra forma de fazer o exercício
 * public static void main (String[] args){
 *   Scanner scan = new Scanner(System.in);
 *   
 *   System.out.println("Digite o valor de n:");
 *   int n = scan.nextInt();
 *   
 *   double soma = 0;
 *   
 *   for (int i=1; i<= n; i++){
 *     soma+= 1/i;
 *   }
 *   
 *   System.out.println("Soma = " + soma);
 * }
 */