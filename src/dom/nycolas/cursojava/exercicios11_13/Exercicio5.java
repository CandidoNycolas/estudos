package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número em metros");
			double numeroEmMetros = scan.nextDouble();
			
			double resultado = numeroEmMetros * 100;
			System.out.println(numeroEmMetros + " metros é igual a " + resultado + " centímetros");
		}
		
	}

}
