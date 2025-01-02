package com.exercicios12.java;

public class ZooMamifero extends ZooAnimal {
	private String alimento;
	
	public ZooMamifero() {
		super();
		this.setCor("castanho");
		this.setAlimento("mel");
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nAlimento: " + alimento;
		
		return s;
	}
}
