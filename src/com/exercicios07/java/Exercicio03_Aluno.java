package com.exercicios07.java;

import static java.lang.System.out;

public class Exercicio03_Aluno {	
	int matricula;
	double[] nota = new double[3];
	String nome, curso;
	String[] disciplina = new String[3];
	
	void verificarSituacao(int posicao) {
		if (nota[posicao] >= 7) {
			out.println("Aluno aprovado na disciplina " + disciplina[posicao]);
		} else if (nota[posicao] < 7) {
			out.println("Aluno reprovado na disciplina " + disciplina[posicao]);
		}
	}
}
