package com.exercicios03.java;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercicio21_MediaTurmas {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		int i = 1, turma, aluno;
		Double media = (double) 0;
		
		System.out.println("Quantas turmas existem: ");
		turma = scan.nextInt();
		
		while (i <= turma) {
			aluno = 0;
			do {
				System.out.println("Quantos alunos existem na "+i+"ª turma?");
				aluno = scan.nextInt();
				
				if ((aluno <= 0) || (aluno > 40)) {
					System.out.print("Atenção, quantidade de alunos inconssistente!!\n");
				}
			} while ((aluno<=0) || (aluno > 40));
			
			media+= aluno;
			
			++i;
		}

		DecimalFormat formatador = new DecimalFormat("0.00");		
		System.out.println("Número médio de alunos por turma: "+formatador.format(media/turma)+" Alunos");
	}

}
