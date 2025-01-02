package com.exercicios13.java;

public class _TesteFigura {

	public static void main(String[] args) {
		Circulo tf1 = new Circulo();
		tf1.setCor("Verde");
		tf1.setNome("Teste Figura 1");
		tf1.setRaio(2.5);
		
		Quadrado tf2 = new Quadrado();
		tf2.setCor("Azul");
		tf2.setLado(4);
		tf2.setNome("Teste Figura 2");
		
		Triangulo tf3 = new Triangulo();
		tf3.setAltura(3.2);
		tf3.setBase(3.2);
		tf3.setCor("Amarelo");
		tf3.setNome("Teste Figura 3");
		
		Cubo tf4 = new Cubo();
		tf4.setCor("Roxo");
		tf4.setLado(2);
		tf4.setNome("Teste Figura 4");
		
		Cilindro tf5 = new Cilindro();
		tf5.setAltura(10);
		tf5.setCor("Preto");
		tf5.setNome("Teste Figura 5");
		tf5.setRaio(6.8);
		
		Piramide tf6 = new Piramide();
		tf6.setAltura(22.6);
		tf6.setApotema(14.2);
		tf6.setArestaBase(16.4);
		tf6.setBase(tf2);
		tf6.setCor("Vermelho");
		tf6.setNome("Teste Figura 6");
		tf6.setNumPoliBase(4);
		
		FiguraGeometrica[] tfg1 = new FiguraGeometrica[6];
		tfg1[0] = tf1;
		tfg1[1] = tf2;
		tfg1[2] = tf3;
		tfg1[3] = tf4;
		tfg1[4] = tf5;
		tfg1[5] = tf6;
		
		System.out.println("— — — — — — — — — — — — — — — — — — — —\n");
		
		for (FiguraGeometrica fg : tfg1) {			
			System.out.println(fg.getCor());
			System.out.println(fg.getNome());
			
			if (fg instanceof Figura2D) {
				Figura2D f2d = (Figura2D) fg;
				System.out.println("ÁREA: "+f2d.calcularArea()+"\n");
			}
			
			if (fg instanceof Figura3D) {
				Figura3D f3d = (Figura3D) fg;
				System.out.println("ÁREA: "+f3d.calcularArea());
				System.out.println("VOLUME: "+f3d.calcularVolume()+"\n");
			}
			
			System.out.println("— — — — — — — — — — — — — — — — — — — —\n");
		}
	}

}
