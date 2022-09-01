package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite dois números");
		double valor1 = scan.nextDouble();
		double valor2 = scan.nextDouble();
		
		if (valor1 > valor2) {
			System.out.println("O maior número é: " + valor1);
		} else if (valor1 < valor2) {
			System.out.println("O maior número é: " + valor2);
		} else if (valor1 == valor2) {
			System.out.println("Os números são iguais");
	}
	}
}

