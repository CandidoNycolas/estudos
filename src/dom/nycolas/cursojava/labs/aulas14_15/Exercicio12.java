package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Quanto você ganha por hora?");
			double ganhoHora = scan.nextDouble();
			
			System.out.println("Quantas horas trabalhou esse mês?");
			double horasTrabalhadas = scan.nextDouble();
			
			
			double salarioBruto = ganhoHora * horasTrabalhadas;
			double ir = 0;
			double inss = salarioBruto/100 * 10;
			double sindicato = salarioBruto/100 * 3;
			double fgts = salarioBruto/100 * 11;
			
			if (salarioBruto <= 900)
				ir = 0;
			if ((salarioBruto > 900) && (salarioBruto <= 1500))
				ir = 5;
			if ((salarioBruto > 1500) && (salarioBruto <= 2500))
				ir = 10;
			if (salarioBruto > 2500)
				ir = 20;
			
			double totalDescontos = (salarioBruto/100*ir)+inss+sindicato;
			double salarioLiquido = salarioBruto-totalDescontos;
			
			System.out.println("Salário bruto (" + ganhoHora + " * " +  horasTrabalhadas +"): R$" + salarioBruto); 
			System.out.println("(-) IR (" + ir + "%): " + salarioBruto/100*ir);
			System.out.println("(-) INSS (10%): " + inss);
			System.out.println("(-) Sindicato (3%): " + sindicato);
			System.out.println("FGTS (11%): " + fgts);
			System.out.println("Total de Descontos: " + totalDescontos);
			System.out.println("Salário Líquido: " + salarioLiquido);
		}
	}
	}
