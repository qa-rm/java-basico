package com.exercicios13.java;

public class Cubo extends Figura3D implements DimensaoSuperficial, DimensaoVolumetrica{
	
	private int lado;

	@Override
	public double calcularArea() {
		return 6 * Math.pow(lado, 2);
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
}
