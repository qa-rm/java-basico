package com.exercicios12.java;

public class TesteImpostoRenda {

	public static void main(String[] args) {
		ContribuintePessoaFisica p1 = new ContribuintePessoaFisica();
		p1.setNome("Contribuinte 01");
		p1.setRendaBruta(1000);
		p1.setCpf("905.795.870-88");
		
		ContribuintePessoaJuridica p2 = new ContribuintePessoaJuridica();
		p2.setNome("Contribuinte 02");
		p2.setRendaBruta(5000);
		p2.setCnpj("20.847.426/0001-92");
		
		ContribuintePessoaFisica p3 = new ContribuintePessoaFisica();
		p3.setNome("Contribuinte 03");
		p3.setRendaBruta(2000);
		p3.setCpf("886.681.220-02");
		
		ContribuintePessoaJuridica p4 = new ContribuintePessoaJuridica();
		p4.setNome("Contribuinte 04");
		p4.setRendaBruta(3000);
		p4.setCnpj("09.905.348/0001-00");
		
		ContribuintePessoaFisica p5 = new ContribuintePessoaFisica();
		p5.setNome("Contribuinte 05");
		p5.setRendaBruta(3700);
		p5.setCpf("233.358.720-29");
		
		ContribuintePessoaJuridica p6 = new ContribuintePessoaJuridica();
		p6.setNome("Contribuinte 06");
		p6.setRendaBruta(4000);
		p6.setCnpj("37.855.374/0001-07");
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = p1;
		contribuintes[1] = p2;
		contribuintes[2] = p3;
		contribuintes[3] = p4;
		contribuintes[4] = p5;
		contribuintes[5] = p6;
		
		for (Contribuinte c : contribuintes) {
			System.out.println(c.toString());
		}
	}

}
