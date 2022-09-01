package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			double valor1 = scan.nextDouble();
			System.out.println("Digite um segundo número");
			double valor2 = scan.nextDouble();
			System.out.println("Digite um terceiro número");
			double valor3 = scan.nextDouble();
			
			if ((valor1>valor2)&&(valor1>valor3)) {
				System.out.println("O maior número é" + valor1);
			}else if ((valor2>valor1)&&(valor2>valor3)) {
				System.out.println("O maior número é" + valor2);
			}else if ((valor3>valor1)&&(valor3>valor2)) {
				System.out.println("O maior número é" + valor3);
			}
		}
	}

}
