package com.exercicios06.java;

import java.util.Date;

public class LivroBiblioteca {
	String editora;
	String autor;
	String titulo;
	String idioma;
	Integer isbn;
	Integer paginas;
	Double altura;
	Double largura;
	Double profundidade;
	Date dataEmprestimo;
	
	public static void main(String[] args) {
		LivroBiblioteca livro1 = new LivroBiblioteca();
		livro1.editora = "Atica";
		livro1.autor = "Rafael";
		livro1.titulo = "Cálculo I";
		livro1.idioma = "Portugues";
		livro1.isbn = 18520000;
		livro1.paginas = 387;
		livro1.altura = (double) 21;		
		livro1.largura = 15.3;
		livro1.profundidade = 3.62;
		livro1.dataEmprestimo = new Date();
		
		System.out.println(livro1.isbn);
	}

}
