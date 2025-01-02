package com.exercicios07.java;

import static java.lang.System.out;

public class Exercicio02_ContaCorrente {
	int numero;
	double saldo;
	double limite;	
	char status;
	boolean saque;
	
	void realizarSaque(double valor) {
		if (saque == true) {
			if (valor<= saldo) {
				saldo-=valor;			
				out.println("Saque feito no valor de: R$ "+valor);	
			} else {
				out.println("O valor do saque é maior do que o saldo!!");	
			}			
		} else {
			out.println("Não é possível fazer saques nessa conta.");
		}
	}
	
	void depositarDinheiro(double valor) {
		saldo+=valor;
		out.println("Depósito feito no valor de: R$ "+valor);
	}
	
	void consultarSaldo() {
		out.println("Saldo atual: R$ "+saldo);
	}
	
	void verificarCheque() {
		if (status == 's') {
			out.println("Conta está habilitada para usar cheque especial.");			
		} else if (status == 'n') {
			out.println("Conta NÃO está habilitada para usar cheque especial.");
		} else {
			out.println("Sem informações sobre cheque especial");
		}
	}
}
