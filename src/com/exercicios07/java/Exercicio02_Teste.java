package com.exercicios07.java;

public class Exercicio02_Teste {

	public static void main(String[] args) {
		Exercicio02_ContaCorrente conta = new Exercicio02_ContaCorrente();
		conta.limite = 1700.0;
		conta.numero = 1;
		conta.saldo = 10000.0;
		conta.saque = true;
		conta.status = 'n';
		
		conta.realizarSaque(6000.0);
		conta.depositarDinheiro(5200.29);
		conta.consultarSaldo();
		conta.verificarCheque();
	}

}
