package com.exercicios03.java;

public class Exercicio16_FibonacciQuinhentos {
	public static void main(String[] args) {
		int num, numA = 1, numB = 0;

		do {
			System.out.print(numA + " ");

			num=numA+numB;
			numB=numA;
			numA=num;
		} while (numB<500);
	}
}