package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número inteiro"); //faltou o inteiro
			int valor1 = scan.nextInt();
			System.out.println("O número informado foi " + valor1);
		}
	}

}
