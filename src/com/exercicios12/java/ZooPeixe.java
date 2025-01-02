package com.exercicios12.java;

public class ZooPeixe extends ZooAnimal {
	private String caracteristicas;
	
	public ZooPeixe() {
		this.setPatas(0);
		this.setAmbiente("mar");
		this.setCor("cinzenta");
		this.setCaracteristicas("barbatanas e cauda");
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}
	
	@Override
	public String toString() {
		String s = super.toString();
		s += "\nCaracterísticas: " + caracteristicas;
		
		return s;
	}
}
