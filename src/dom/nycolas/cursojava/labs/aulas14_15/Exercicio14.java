package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite sua 1º nota");
			double nota1 = scan.nextDouble();
			System.out.println("Digite sua 2º nota");
			double nota2 = scan.nextDouble();
			
			double media = (nota1 + nota2) / 2;
			System.out.println("Suas notas foram: " + nota1 + " e " + nota2 + ". A sua média é: " + media);
			
			if (media >= 9) {
				System.out.println("Seu conceito é: A. Você foi: APROVADO");
			} else if ((media < 9) && (media >= 7.5)) {
				System.out.println("Seu conceito é: B. Você foi: APROVADO");
			} else if ((media < 7.5) && (media >= 6)) {
				System.out.println("Seu conceito é: C. Você foi: APROVADO");
			} else if ((media < 6) && (media >= 4)) {
				System.out.println("Seu conceito é: D. Você foi: REPROVADO");
			} else if (media < 4) {
				System.out.println("Seu conceito é: E. Você foi: REPROVADO");
}
		}
}
}

