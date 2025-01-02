package com.exercicios06.java;

public class ContatoCelular {
    String nome;
    String email;
    String endereco;
    String[] telefones;
    
	public static void main(String[] args) {
		ContatoCelular contato1 = new ContatoCelular();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";
        
        contato1.telefones = new String[5];
        contato1.telefones[0] = "99999-9999";
        contato1.telefones[1] = "99999-9998";
        contato1.telefones[2] = "99999-9997";

	}

}
