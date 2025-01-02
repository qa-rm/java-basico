package com.exercicios03.java;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.io.IOException;

public class Exercicio25_CaixaRegistradora {

	private static Scanner scan;
	private static DecimalFormat formatFloat;

	public static void main(String[] args) throws IOException, InterruptedException {
		scan = new Scanner(System.in);
		formatFloat = new DecimalFormat("0.00");
		
		int menu = -1, i = 0;
		Double val = (double) 0, total = (double) 0, dinheiro = (double) 0;
		
		while ((menu != 0) && (menu != 1)) {
			System.out.print("o MENU: [1 = Novo] [0 = Sair]\n\r");
			menu = scan.nextInt();
			System.out.println("o Lojas Tabajara");
			
			if (menu == 1) {
				val = scan.nextDouble();
				do {
					++i;					
					System.out.println("o Produto "+i+": R$ "+formatFloat.format(val));					
					total+= val;
					val = scan.nextDouble();
				} while (val != 0);
				
				System.out.println("o Total da compra: R$ "+formatFloat.format(total));
				System.out.println("o Qual o valor em dinheiro?");
				dinheiro = scan.nextDouble();
				
				if (dinheiro > total) {
					System.out.println("o Troco: R$ "+formatFloat.format(dinheiro - total));
				} else if (total > dinheiro) {
					System.out.println("o Cliente em débito: R$ "+formatFloat.format(total - dinheiro));
				} else if ((total - dinheiro) == 0) {
					System.out.println("o Perfeito, volte sempre!!\n\r");
				}
				
				do {
					System.out.print("o MENU: [3 = Nova Operação] [0 = Sair]\n\r");
					menu = scan.nextInt();
				} while ((menu != 3) && (menu != 0));
		        
				System.out.print('\u000C');	
			} else
			if (menu == 0) {System.out.print("o ...");}
			else {
				System.out.print("o Opção inválida.");
				System.out.print('\u000C');
				//Runtime.getRuntime().exec("cls");
				//Limpa a tela no windows, no linux e no MacOS
		        //if (System.getProperty("os.name").contains("Windows"))
		        //    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        //else
		        //    Runtime.getRuntime().exec("clear");
			}
		}
	}

}
