package com.exercicios12.java;

public class TesteContaBancaria {

	public static void main(String[] args) {
		System.out.println("**********Conta Bancária**********");
		
		ContaBancaria contaSimples = new ContaBancaria();
		contaSimples.setNomeCliente("Rafael M. Motta");
		contaSimples.setNumConta(7);
		
		contaSimples.depositar(250);
		
		realizarSaque(contaSimples, 100);
		
		realizarSaque(contaSimples, 200);
		
		System.out.println(contaSimples);
		
		System.out.println("**********Conta Poupança**********");
		
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		contaPoupanca.setNomeCliente("Rafael M. Motta");
		contaPoupanca.setNumConta(8);
		contaPoupanca.setDiaRendimento(3);
		
		contaPoupanca.depositar(250);
		
		realizarSaque(contaPoupanca, 100);
		
		realizarSaque(contaPoupanca, 200);
		
		if (contaPoupanca.calcularNovoSaldo(0.5)) {
			System.out.println("Rendimento aplicado, novo saldo é de = " + contaPoupanca.getSaldo());
		} else {
			System.out.println("Hoje não é dia de rendimento, novo saldo não calculado " + contaPoupanca.getSaldo());
		}
		
		System.out.println(contaPoupanca);
		
		System.out.println("**********Conta Especial**********");
		
		ContaEspecial contaEspecial = new ContaEspecial();
		contaEspecial.setNomeCliente("Rafael M. Motta");
		contaEspecial.setNumConta(9);
		contaEspecial.setLimite(50);
		
		contaEspecial.depositar(250);
		
		realizarSaque(contaEspecial, 100);
		
		realizarSaque(contaEspecial, 210);
		
		System.out.println(contaEspecial);

	}
	
	private static void realizarSaque(ContaBancaria conta, double valor) {
		if (conta.sacar(valor)) {
			System.out.println("Saque efetuado com sucesso, novo saldo = " + conta.getSaldo());
		} else {
			System.out.println("Saldo insuficiente para saque de " + valor + "; saldo de " + conta.getSaldo());
		}
	}

}
