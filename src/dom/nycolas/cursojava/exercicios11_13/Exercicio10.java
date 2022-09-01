package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Digite a temperatura em Celsius");
			double celsius = scan.nextDouble();
			
			double faren = celsius * 1.8 + 32;
			System.out.println("A temperatura em Farenheit é de " + faren +"°" );
		}
	}

}
