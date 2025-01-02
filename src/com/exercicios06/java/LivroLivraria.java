package com.exercicios06.java;

public class LivroLivraria {
	String editora;
	String autor;
	String titulo;
	String idioma;
	Integer isbn;
	Integer paginas;
	Double altura;
	Double largura;
	Double profundidade;
	Double preco;
	
	public static void main(String[] args) {
		LivroLivraria livro1 = new LivroLivraria();
		livro1.editora = "Vagalume Júnior";
		livro1.autor = "Rafael";
		livro1.titulo = "O mistério da ilha";
		livro1.idioma = "Portugues";
		livro1.isbn = 22561000;
		livro1.paginas = 238;
		livro1.altura = (double) 18;		
		livro1.largura = 11.7;
		livro1.profundidade = 2.4;
		livro1.preco = 35.25;
		
		System.out.println(livro1.isbn);
	}

}
