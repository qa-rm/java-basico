package com.exercicios07.java;

import static java.lang.System.out;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio03_Teste {	
	
	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Exercicio03_Aluno aluno = new Exercicio03_Aluno();
		
		aluno.nome = "Rafael Meneguim Motta";
		
		//aluno.disciplina[0] = "Linguagem Trabalho e Tecnologia";
		//aluno.disciplina[1] = "Planejamento Recrutamento e Seleção";
		//aluno.disciplina[2] = "Cálculo de Folha de Pagamento";		
		String disciplina;
		out.print("\"Disciplinas\"\n");
		for (int i = 0; i < aluno.disciplina.length; i++) {
			out.print(i+1 + ": ");
			disciplina = scan.nextLine();
			
			aluno.disciplina[i] = disciplina;
		}
		
		//aluno.nota[0] = 10.0;
		//aluno.nota[1] = 8.9;
		//aluno.nota[2] = 6.9;
		out.print("\"Notas\"\n");
		for (int i = 0; i < aluno.nota.length; i++) {
			out.print(aluno.disciplina[i] + ": ");
			
			aluno.nota[i] = scan.nextDouble();
		}
		
		out.println(Arrays.toString(aluno.disciplina));
		aluno.verificarSituacao(0);
		aluno.verificarSituacao(1);
		aluno.verificarSituacao(2);			
	}
}
