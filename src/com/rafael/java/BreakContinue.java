package com.rafael.java;
import java.util.Scanner;

public class BreakContinue {

	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*EXEMPLO BREAK
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Entre com um número"); int num = scan.nextInt();
		 * 
		 * System.out.println("Entre com um limite"); int max = scan.nextInt();
		 * 
		 * for (int i=num; i<=max; i++) { System.out.println(i); if(i % 7 == 0) {
		 * System.out.println("O valor de i é: " + i); break; } }
		 */
		
		/*EXEMPLO DE LABEL (GO TO)
		 *for (int i=0; i<=4; i++) {
		 *	rotulo1: {
		 *		rotulo2: {
		 *			rotulo3: {
		 *				if(i == 1) {
		 *					break rotulo1;
		 *				}
		 *				if(i == 2) {
		 *					break rotulo2;
		 *				}
		 *				if(i == 3) {
		 *					break rotulo3;
		 *				}
		 *				System.out.println("rotulo3");
		 *			}
		 *		System.out.println("rotulo2");
		 *		}
		 *	System.out.println("rotulo1");
		 *	}
		 *System.out.println(i);
		 *}
		 */
		
		//EXEMPLO CONTINUE
		scan = new Scanner(System.in);		  
		
		System.out.println("Entre com um número");
		int num = scan.nextInt();
		
		System.out.println("Entre com um limite");
		int max = scan.nextInt(); 
		
		for (int i=num; i<=max; i++) {
			if(i % 7 == 0) {
				continue;
			}
			System.out.println("O valor de i é: " + i);
		}
		 
	}

}
