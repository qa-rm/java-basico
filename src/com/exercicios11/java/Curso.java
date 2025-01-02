package com.exercicios11.java;

//import java.time.LocalTime;

public class Curso {
	private String nomeCurso;
	//private LocalTime horaCurso;
	private String horaCurso;
	private Professor professor;
	private Aluno[] alunos;
	
	public String getNomeCurso() {
		return nomeCurso;
	}
	
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aluno[] getAlunos() {
		return alunos;
	}
	
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	
	public boolean verificaObjeto(Curso curso) {
		if (curso != null && curso.getAlunos() != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mediaAluno(Aluno aluno) {
		int cont = 0;
		double media = 0.0;
		for (double nota : aluno.getNotas()) {
			cont++;				
			media+= nota;
		}
		
		System.out.println("A média do aluno "+aluno.getNomeAluno()+" é de: "+ (media/cont));
	}
	
	public void aprovacaoAluno(Aluno aluno) {
		int cont = 0;
		double media = 0.0;
		for (double nota : aluno.getNotas()) {
			cont++;				
			media+= nota;
		}
		
		if ((media/cont) < 7) {
			System.out.println("Aluno "+aluno.getNomeAluno()+" REPROVADO");
		} else {
			System.out.println("Aluno "+aluno.getNomeAluno()+" APROVADO");
		}			
	}
	
	public static void mediaTurma(Aluno[] alunos) {
		int cont = 0;
		double media = 0.0;
		for (Aluno aluno : alunos) {
			for (double nota : aluno.getNotas()) {
				cont++;				
				media+= nota;
			}
		}
		
		System.out.println("A média da turma é de: "+(media/cont));
	}

	public String getHoraCurso() {
		return horaCurso;
	}

	public void setHoraCurso(String horaCurso) {
		this.horaCurso = horaCurso;
	}

}
