package com.rafael.java;

import static java.lang.System.out;

public class Matriz3D {

	public static void main(String[] args) {
		int[][][] matriz3D = new int[3][3][3];
		
		for(int i = 0; i<matriz3D.length; i++) {
			for(int j = 0; j<matriz3D[i].length; j++) {
				for(int k = 0; k<matriz3D[i][j].length; k++) {
					//out.println("i = " + i + "/ j = " + j + "/ k = " + k);
					matriz3D[i][j][k] = i + j + k;
				}
			}
		}
		
		int soma = 0, somaPares = 0, somaImpares = 0;
		for(int i = 0; i<matriz3D.length; i++) {
			for(int j = 0; j<matriz3D[i].length; j++) {
				for(int k = 0; k<matriz3D[i][j].length; k++) {
					soma+= matriz3D[i][j][k];
					
					if (matriz3D[i][j][k] % 2 == 0) {
						somaPares+= matriz3D[i][j][k];
					} else {
						somaImpares+= matriz3D[i][j][k];
					}
				}
			}
		}

		out.println("Soma total = " + soma);
		out.println("Soma pares = " + somaPares);
		out.println("Soma ímpares = " + somaImpares);
	}

}
