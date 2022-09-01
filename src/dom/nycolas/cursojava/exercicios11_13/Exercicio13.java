package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Quanto você ganha por hora?");
			double ganhoHora = scan.nextDouble();
			
			System.out.println("Quantas horas trabalhou esse mês?");
			double horasTrabalhadas = scan.nextDouble();
			
			
			double salarioBruto = ganhoHora * horasTrabalhadas;
			double ir = salarioBruto * 11/100; //ou: (salarioBruto/100) * 11
			double inss = salarioBruto * 8/100; //ou: (salarioBruto/100) * 8
			double sindicato = salarioBruto * 5/100; //ou: (salarioBruto/100) * 5
			double salarioLiquido = salarioBruto-ir-inss-sindicato;
			// Ou: double totalDescontos = inss + sindicato + ir -> double salarioLiquido = salarioBruto - totalDescontos
			
			System.out.println("Seu salário bruto esse mês é de R$" + salarioBruto);
			System.out.println("Você pagou R$" + ir + " ao Imposto de Renda");
			System.out.println("Você pagou R$" + inss + " ao INSS");
			System.out.println("Você pagou R$" + sindicato + " ao Sindicato");
			System.out.println("Logo, o seu salário líquido é de R$" + salarioLiquido);
			
		}
		
	}

}
