package com.exercicios03.java;

import static java.lang.System.out;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio32_CardapioLanchonete {

	private static DecimalFormat formatFloat;
	private static Scanner scan;
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("###,###,##0.00");
		
		out.print("o Especificação   | Código |  Preço "+
				"\no ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓|↓↓↓↓↓↓↓↓|↓↓↓↓↓↓↓↓"+
				"\no Cachorro Quente |  100   | R$ 1,20"+
				"\no Bauru Simples   |  101   | R$ 1,30"+
				"\no Bauru com ovo   |  102   | R$ 1,50"+
				"\no Hambúrguer      |  103   | R$ 1,20"+
				"\no Cheeseburguer   |  104   | R$ 1,30"+
				"\no Refrigerante    |  105   | R$ 1,00\n\r");
		
		String exit = "";
		int cod = 0, qtd = 0;
		Double ped = (double) 0, tot = (double) 0;
		
		do {	
			do {
				cod = 0; qtd = 0;
				
				while((cod<100) || (cod>105)) {
					out.print("Código do item: ");
					cod = scan.nextInt();
				}
				
				while(qtd<1) {
					out.print("Quantidade: ");
					qtd = scan.nextInt();
				}
				
				switch (cod) {
				case 100: case 103: ped = qtd * 1.2; break;
				case 101: case 104:	ped = qtd * 1.3; break;
				case 102: ped = qtd * 1.5; break;
				case 105: ped = (double) qtd; break;
				default: break; }
				
				tot+= ped;
				
				out.print("Total a ser pago por itens no pedido: R$ "+formatFloat.format(ped));
				
				exit = "";
				
				while ((!exit.equalsIgnoreCase("S")) && (!exit.equalsIgnoreCase("N"))) {
					out.print("\nDeseja adicionar mais itens ao pedido? (S/N): ");
					exit = scan.next();
				}
			} while (exit.equalsIgnoreCase("S"));
		
			exit = "";
		
			while ((!exit.equalsIgnoreCase("S")) && (!exit.equalsIgnoreCase("N"))) {
				out.print("Deseja finalizar o pedido? (S/N): ");
				exit = scan.next();
			}
		} while (!exit.equalsIgnoreCase("S"));
		out.print("\nTotal geral do pedido: R$ "+formatFloat.format(tot));
	}
}