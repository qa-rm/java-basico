package com.exercicios13.java;

public class Triangulo extends Figura2D implements DimensaoSuperficial{
	private double base;
	private double altura;

	@Override
	public double calcularArea() {
		return (altura * base)/2;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
