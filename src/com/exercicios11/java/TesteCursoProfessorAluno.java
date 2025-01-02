package com.exercicios11.java;

//import java.time.LocalTime;
//import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import static java.lang.System.out;

public class TesteCursoProfessorAluno {

	private static Scanner scan;
	
	private static void CadastrarAluno(Scanner s, Aluno a) {
		System.out.println("Nome do Aluno: ");
		String nome = s.next();
		a.setNomeAluno(nome);
		
		System.out.println("Matrícula do Aluno: ");
		int matricula = s.nextInt();
		a.setMatriculaAluno(matricula);
		
		double[] nota = new double[4];
		int vetor = 0;
		for (@SuppressWarnings("unused") Double i : nota) {		
			out.print("Nota["+(vetor+1)+"] = ");
			nota[vetor] = s.nextDouble();
			
			vetor++;
		}
		
		a.setNotas(nota);
	}

	public static void main(String[] args) {
		System.out.println("***Cadastro do novo Curso***");
		
		Curso curso = new Curso();
		Professor profe = new Professor();
		Aluno al1 = new Aluno();
		Aluno al2 = new Aluno();
		Aluno al3 = new Aluno();
		Aluno al4 = new Aluno();
		Aluno al5 = new Aluno();
		scan = new Scanner(System.in);
		
		System.out.println("Nome do curso: ");
		String nomeCurso = scan.next();
		
		/*DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("H:mm:ss");
		System.out.println("Hora do curso: ");
		String horaCursoString = scan.nextLine();
		LocalTime horaCurso = LocalTime.parse(horaCursoString, parseFormat);*/
		System.out.println("Hora do curso: ");
		String horaCurso = scan.next();
		
		System.out.println("Nome do professor: ");
		String nomeProfessor = scan.next();
		
		System.out.println("Departamento do professor: ");
		String depProfessor = scan.next();
		
		System.out.println("E-mail do professor: ");
		String emailProfessor = scan.next();
		
		CadastrarAluno(scan, al1);
		CadastrarAluno(scan, al2);
		CadastrarAluno(scan, al3);
		CadastrarAluno(scan, al4);
		CadastrarAluno(scan, al5);
		
		curso.setNomeCurso(nomeCurso);
		curso.setHoraCurso(horaCurso);
		
		profe.setNomeProfessor(nomeProfessor);
		profe.setDepProfessor(depProfessor);
		profe.setEmailProfessor(emailProfessor);
		curso.setProfessor(profe);
		
		Aluno[] alunos = new Aluno[5];
		alunos[0] = al1;
		alunos[1] = al2;
		alunos[2] = al3;
		alunos[3] = al4;
		alunos[4] = al5;
		
		curso.setAlunos(alunos);
		
		for (Aluno aluno : alunos) {
			curso.mediaAluno(aluno);
			curso.aprovacaoAluno(aluno);
		}
		
		Curso.mediaTurma(alunos);
		
	}

}
