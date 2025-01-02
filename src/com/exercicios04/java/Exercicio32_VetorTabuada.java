package com.exercicios04.java;

import static java.lang.System.out;
import java.util.Scanner;

public class Exercicio32_VetorTabuada {
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int[] A = new int[5];
		int j = 0;
		
		for (int i : A) {
			i+= j;
			
			out.print("Vetor A["+i+"] = ");
			A[i] = scan.nextInt();
			
			out.println("Tabuada do "+A[i]+":\n"+
			A[i]+" x 1  = "+A[i]*1+"\n"+
			A[i]+" x 2  = "+A[i]*2+"\n"+
			A[i]+" x 3  = "+A[i]*3+"\n"+
			A[i]+" x 4  = "+A[i]*4+"\n"+
			A[i]+" x 5  = "+A[i]*5+"\n"+
			A[i]+" x 6  = "+A[i]*6+"\n"+
			A[i]+" x 7  = "+A[i]*7+"\n"+
			A[i]+" x 8  = "+A[i]*8+"\n"+
			A[i]+" x 9  = "+A[i]*9+"\n"+
			A[i]+" x 10 = "+A[i]*10+"\n");
			
			j++;
		}		
	}
}
