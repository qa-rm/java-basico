package com.exercicios13.java;

public class Circulo extends Figura2D implements DimensaoSuperficial{
	private double raio;

	@Override
	public double calcularArea() {
		return Math.pow(raio, 2) * Math.PI;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
