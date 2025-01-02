package com.rafael.java;

import static java.lang.System.out;

public class Matriz {

	public static void main(String[] args) {
		double[][] notasAlunos = new double[3][4];//30 alunos e 4 notas — linhas e colunas
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 9;
		notasAlunos[0][3] = 9.5;
		
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
		
		for(int i = 0; i<notasAlunos.length; i++) {
//			out.print(notasAlunos[i] + " ");
			for (int j = 0; j < notasAlunos[i].length; j++) {
				out.print(notasAlunos[i][j] + " - ");
			}
			out.println();
		}
		//FOR EACH
		out.println("Exemplo com FOREACH");
		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				out.print(nota + " - ");
			}
			out.println();
		}
		
		notasAlunos[1][3] = 8;
		out.println();
		
		for(int i = 0; i<notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				out.print(notasAlunos[i][j] + " - ");
			}
			out.println();
		}
				
		out.println("Calculando a Média de cada Aluno");
		double soma;
		
		for(int i = 0; i<notasAlunos.length; i++) {
			
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma+= notasAlunos[i][j];
			}
			
			out.println("Média do Aluno " + i + " é = " + (soma/4));
		}
		
		/*Para inicializar vetores e matrizes
		 * double[] notas = {7, 8, 9, 10};
		 * double[][] notas2 = {{7, 8, 9, 10}, {8, 6, 7, 10}} 
		 * for(int i = 0; i<notas2[i].length; i++){
		 * 		for(int j = 0; j<notas2[i].length; j++){
		 * 			out.print(notas2[i][j] + " - ");
		 * 		}
		 * 		out.println();
		 * }
		 * */
		
	}

}
