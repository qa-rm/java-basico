package com.exercicios12.java;

public class ContaBancaria {
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s = "ContaBancaria[";
		s += "nomeCliente: " + nomeCliente;
		s += "; numeroConta: " + numConta;
		s += "; saldo: " + saldo;
		s += "]";
		
		return s;
	}
	
	public void depositar(double deposito) {
		saldo += deposito;
	}
	
	public boolean sacar(double saque) {
		if ((saldo-saque) >= 0) {
			saldo -= saque;
			return true;
		}
		return false;
	}
	
}
