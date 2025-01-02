package com.exercicios05.java;

import static java.lang.System.out;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio05_AgendaAnual {
	private static Scanner scan;

	public static void main(String[] args) throws IOException, InterruptedException {
		scan = new Scanner(System.in);
		
		int menu = -1, mes, dia, hora;
		String[][][] agenda = new String[31][8][12];//31 dias máx., 8 horas e 12 meses 
		
		while ((menu != 0) && (menu != 1) && (menu != 2)) {
			out.print("o MENU: [1 = Novo] [2 = Consulta] [0 = Sair]\n\r");
			menu = scan.nextInt();
			out.println("o Agenda de Compromissos");
			
			if (menu == 1) {
				out.print("===ALTERAÇÕES===\n");
				do {				
					out.print("Mês: ");
					mes = scan.nextInt();
				} while ((mes < 1) || (mes > 12));
				do {				
					out.print("Dia: ");
					dia = scan.nextInt();
				} while ((dia < 1) || (dia > 31));
				do {				
					out.print("Hora: ");
					hora = scan.nextInt();
				} while ((hora < 1) || (hora > 8));
				
				out.println("o Compromisso: ");
				scan.nextLine();//esvazia o buffer do teclado
				agenda[dia][hora][mes] = scan.nextLine();
				
				do {
					out.print("o MENU: [3 = Nova Operação] [0 = Sair]\n\r");
					menu = scan.nextInt();
				} while ((menu != 3) && (menu != 0));
			} else
			if (menu == 2) {
				out.print("===CONSULTAS===\n");
				do {				
					out.print("Mês: ");
					mes = scan.nextInt();
				} while ((mes < 1) || (mes > 12));
				do {				
					out.print("Dia: ");
					dia = scan.nextInt();
				} while ((dia < 1) || (dia > 31));
				do {				
					out.print("Hora: ");
					hora = scan.nextInt();
				} while ((hora < 1) || (hora > 8));
				
				out.println("o Compromisso: "+agenda[dia][hora][mes]);
				
				do {
					out.print("o MENU: [3 = Nova Operação] [0 = Sair]\n\r");
					menu = scan.nextInt();
				} while ((menu != 3) && (menu != 0));
			} else
			if (menu == 0) {out.print("o ...");}
			else {
				out.print("o Opção inválida.\n");
			}
		}
	}
}
