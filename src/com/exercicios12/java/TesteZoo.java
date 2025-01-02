package com.exercicios12.java;

public class TesteZoo {

	public static void main(String[] args) {
		ZooAnimal camelo = new ZooAnimal();
		camelo.setNome("Camelo");
		camelo.setComprimento(190);
		camelo.setCor("Caramelo");
		camelo.setAmbiente("Deserto");
		camelo.setVelocidade(2);
		System.out.println(camelo);
		
		ZooPeixe tubarao = new ZooPeixe();
		tubarao.setNome("Tubarão");
		tubarao.setComprimento(300);
		tubarao.setAmbiente("Mar");
		tubarao.setVelocidade(25);
		System.out.println(tubarao);
		
		ZooMamifero urso = new ZooMamifero();
		urso.setNome("Urso");
		urso.setComprimento(250);
		urso.setCor("Pardo");
		urso.setAmbiente("Floresta");
		urso.setVelocidade(15);
		System.out.println(urso);
		pontilhado();
		
		/*
		 * ZooAnimal[] animais = new ZooAnimal[3]; animais[0] = camelo; animais[0] =
		 * tubarao; animais[0] = urso;
		 * 
		 * for (ZooAnimal animal : animais) { System.out.println(animal.toString());
		 * System.out.println("\n--------------------------------------------------"); }
		 */
	}
	
	private static void pontilhado() {
		System.out.println("\n--------------------------------------------------");
	}

}
