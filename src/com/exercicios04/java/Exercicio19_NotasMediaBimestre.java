package com.exercicios04.java;

import static java.lang.System.out;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio19_NotasMediaBimestre {
	private static Scanner scan;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.00");
		
		   int[] R = new int[10]; //Referência
		 float[] A = new float[R.length], B = new float[R.length];
		double[] C = new double[R.length]; //Result
		int j = 0;
		
		for (int i : R) {
			i+= j;
			
			out.print("Nota 1º Bimestre Aluno["+(i+1)+"] = ");
			A[i] = scan.nextFloat();
			out.print("Nota 2º Bimestre Aluno["+(i+1)+"] = ");
			B[i] = scan.nextFloat();
			
			C[i] = (A[i] + B[i]) / 2;
			
			if (C[i] >= 7) {
				out.println("Aluno ["+(i+1)+"] Aprovado com média: "+formatFloat.format(C[i]));
			} else {
				out.println("Aluno ["+(i+1)+"] Reprovado com média: "+formatFloat.format(C[i]));
			}
			
			j++;
		}
	}
}
