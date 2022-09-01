package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Quanto você ganha por hora?");
			double ganhoHora = scan.nextDouble();
			
			System.out.println("Quantas horas trabalhou esse mês?");
			double horasTrabalhadas = scan.nextDouble();
			
			double salario = ganhoHora * horasTrabalhadas;
			System.out.println("Seu salário esse mês é de R$" + salario);
		}

		
	}

}
