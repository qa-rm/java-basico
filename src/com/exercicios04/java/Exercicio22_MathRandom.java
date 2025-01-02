package com.exercicios04.java;

import static java.lang.System.out;
import java.text.DecimalFormat;
//import java.util.Random;

public class Exercicio22_MathRandom {
	private static DecimalFormat formatFloat;

	public static void main(String[] args) {
		formatFloat = new DecimalFormat("###,###,##0.00");
		//Random random = new Random(); 
		
		int[] A = new int[10];
		int j = 0, zero = 0, um = 0;
		
		for (int i : A) {
			i+= j;
			//random.nextInt(2);
			A[i] =  (int)Math.round(Math.random() * 1);
			
			if (A[i] == 0) {
				zero++;
			} else if (A[i] == 1) {
				um++;
			}			
			
			j++;
		}
		
		out.println("% Zero = "+formatFloat.format((zero * 100)/(float) A.length)+"\n% Um = "+ formatFloat.format((um * 100)/(float) A.length));
	}	
}
