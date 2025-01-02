package com.exercicios02.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio23_Acougue {

	private static Scanner scan;
	private static Double precoTotal;
	private static String fPg;

	public static String format(double x) {  
	    DecimalFormat df = new DecimalFormat("#0.00");  
	    return df.format(x);
	}	
	
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo de carne: \n" + 
						   "1 - File Duplo || 2 - Alcatra || 3 - Picanha");
		
		int opc1 = scan.nextInt();
		
		switch (opc1) {
		case 1:
		case 2:
		case 3:
			System.out.println("Informe a quantidade de carne a ser comprada (Kg): ");
			Double opc2 = scan.nextDouble();
			
			switch (opc1) {
			case 1:
				if ((opc2 <= 5) && (opc2 > 0)) {
					precoTotal = opc2 * 4.9;
					
					System.out.println("Agora, informe a forma de pagamento: \n" + 
									   "D - Dinheiro || C - Cartão || T - Cartão Tabajara");
					fPg = scan.next().toUpperCase().trim();
					
					switch (fPg) {
					case "D":
						System.out.println("Tipo de Carne: File Duplo\n" +
										   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
										   "Preço total: R$ " + format(precoTotal) + "\n" +
										   "Tipo de pagamento: Dinheiro\n" +
										   "Valor do desconto: R$ 0,00\n" +
										   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "C":
						System.out.println("Tipo de Carne: File Duplo\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão\n" +
								   "Valor do desconto: R$ 0,00\n" +
								   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "T":
						System.out.println("Tipo de Carne: File Duplo\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão tabajara\n" +
								   "Valor do desconto: " + format(precoTotal * 0.05) +"\n" +
								   "Valor a pagar: R$ " + format(precoTotal - (precoTotal * 0.05)));
						break;
					default: System.out.println("Forma de pagamento inválida.");
						break;
					}
				} else if ((opc2 > 5) && (opc2 > 0)) {
					precoTotal = opc2 * 5.8;
					
					System.out.println("Agora, informe a forma de pagamento: \n" + 
							   "D - Dinheiro || C - Cartão || T - Cartão Tabajara");
					fPg = scan.next().toUpperCase().trim();
					
					switch (fPg) {
					case "D":
						System.out.println("Tipo de Carne: File Duplo\n" +
										   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
										   "Preço total: R$ " + format(precoTotal) + "\n" +
										   "Tipo de pagamento: Dinheiro\n" +
										   "Valor do desconto: R$ 0,00\n" +
										   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "C":
						System.out.println("Tipo de Carne: File Duplo\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão\n" +
								   "Valor do desconto: R$ 0,00\n" +
								   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "T":
						System.out.println("Tipo de Carne: File Duplo\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão tabajara\n" +
								   "Valor do desconto: " + format(precoTotal * 0.05) +"\n" +
								   "Valor a pagar: R$ " + format(precoTotal - (precoTotal * 0.05)));
						break;
					default: System.out.println("Forma de pagamento inválida.");
						break;
					}
				}
				break;
			case 2:
				if ((opc2 <= 5) && (opc2 > 0)) {
					precoTotal = opc2 * 5.9;
					
					System.out.println("Agora, informe a forma de pagamento: \n" + 
									   "D - Dinheiro || C - Cartão || T - Cartão Tabajara");
					fPg = scan.next().toUpperCase().trim();
					
					switch (fPg) {
					case "D":
						System.out.println("Tipo de Carne: Alcatra\n" +
										   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
										   "Preço total: R$ " + format(precoTotal) + "\n" +
										   "Tipo de pagamento: Dinheiro\n" +
										   "Valor do desconto: R$ 0,00\n" +
										   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "C":
						System.out.println("Tipo de Carne: Alcatra\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão\n" +
								   "Valor do desconto: R$ 0,00\n" +
								   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "T":
						System.out.println("Tipo de Carne: Alcatra\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão tabajara\n" +
								   "Valor do desconto: " + format(precoTotal * 0.05) +"\n" +
								   "Valor a pagar: R$ " + format(precoTotal - (precoTotal * 0.05)));
						break;
					default: System.out.println("Forma de pagamento inválida.");
						break;
					}
				} else if ((opc2 > 5) && (opc2 > 0)) {
					precoTotal = opc2 * 6.8;
					
					System.out.println("Agora, informe a forma de pagamento: \n" + 
							   "D - Dinheiro || C - Cartão || T - Cartão Tabajara");
					fPg = scan.next().toUpperCase().trim();
					
					switch (fPg) {
					case "D":
						System.out.println("Tipo de Carne: Alcatra\n" +
										   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
										   "Preço total: R$ " + format(precoTotal) + "\n" +
										   "Tipo de pagamento: Dinheiro\n" +
										   "Valor do desconto: R$ 0,00\n" +
										   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "C":
						System.out.println("Tipo de Carne: Alcatra\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão\n" +
								   "Valor do desconto: R$ 0,00\n" +
								   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "T":
						System.out.println("Tipo de Carne: Alcatra\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão tabajara\n" +
								   "Valor do desconto: " + format(precoTotal * 0.05) +"\n" +
								   "Valor a pagar: R$ " + format(precoTotal - (precoTotal * 0.05)));
						break;
					default: System.out.println("Forma de pagamento inválida.");
						break;
					}
				}
				break;
			case 3:
				if ((opc2 <= 5) && (opc2 > 0)) {
					precoTotal = opc2 * 6.9;
					
					System.out.println("Agora, informe a forma de pagamento: \n" + 
									   "D - Dinheiro || C - Cartão || T - Cartão Tabajara");
					fPg = scan.next().toUpperCase().trim();
					
					switch (fPg) {
					case "D":
						System.out.println("Tipo de Carne: Picanha\n" +
										   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
										   "Preço total: R$ " + format(precoTotal) + "\n" +
										   "Tipo de pagamento: Dinheiro\n" +
										   "Valor do desconto: R$ 0,00\n" +
										   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "C":
						System.out.println("Tipo de Carne: Picanha\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão\n" +
								   "Valor do desconto: R$ 0,00\n" +
								   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "T":
						System.out.println("Tipo de Carne: Picanha\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão tabajara\n" +
								   "Valor do desconto: " + format(precoTotal * 0.05) +"\n" +
								   "Valor a pagar: R$ " + format(precoTotal - (precoTotal * 0.05)));
						break;
					default: System.out.println("Forma de pagamento inválida.");
						break;
					}
				} else if ((opc2 > 5) && (opc2 > 0)) {
					precoTotal = opc2 * 7.8;
					
					System.out.println("Agora, informe a forma de pagamento: \n" + 
							   "D - Dinheiro || C - Cartão || T - Cartão Tabajara");
					fPg = scan.next().toUpperCase().trim();
					
					switch (fPg) {
					case "D":
						System.out.println("Tipo de Carne: Picanha\n" +
										   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
										   "Preço total: R$ " + format(precoTotal) + "\n" +
										   "Tipo de pagamento: Dinheiro\n" +
										   "Valor do desconto: R$ 0,00\n" +
										   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "C":
						System.out.println("Tipo de Carne: Picanha\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão\n" +
								   "Valor do desconto: R$ 0,00\n" +
								   "Valor a pagar: R$ " + format(precoTotal));
						break;
					case "T":
						System.out.println("Tipo de Carne: Picanha\n" +
								   "Quantidade de Carne: " + format(opc2) + "Kg.\n" +
								   "Preço total: R$ " + format(precoTotal) + "\n" +
								   "Tipo de pagamento: Cartão tabajara\n" +
								   "Valor do desconto: " + format(precoTotal * 0.05) +"\n" +
								   "Valor a pagar: R$ " + format(precoTotal - (precoTotal * 0.05)));
						break;
					default: System.out.println("Forma de pagamento inválida.");
						break;
					}
				}
				break;
			default: System.out.println("Quantidade de carne inválida.");
				break;
			}
			break;
		default: System.out.println("Opção inválida!!");
			break;
		}
	}

}
