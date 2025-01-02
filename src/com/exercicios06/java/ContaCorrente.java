package com.exercicios06.java;

public class ContaCorrente {
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	public static void main(String[] args) {
		ContaCorrente conta1 = new ContaCorrente();
		conta1.numero = "987654";
		conta1.agencia = "151";
		conta1.especial = true;
		conta1.limiteEspecial = 59000.00;
		conta1.saldo = 0.00;

		System.out.println("Saldo da conta: "+conta1.saldo);
	}

}
