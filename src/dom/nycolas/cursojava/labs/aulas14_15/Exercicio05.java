package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Digite a nota do 1º bimestre");
				double nota1 = scan.nextDouble();
				System.out.println("Digite a nota do 2º bimestre");
				double nota2 = scan.nextDouble();
				
				double media = (nota1 + nota2) / 2;
				System.out.println("A média dos 2 bimestres é: " + media);
				
				if ((media >= 7) && (media < 10)) {
					System.out.println("Aprovado");
				} else if (media < 7) {
					System.out.println("Reprovado");
				} else if (media == 10) {
					System.out.println("Aprovado com Distinção");
	}
			}
	}
}
