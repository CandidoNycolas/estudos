package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Digite a temperatura em Farenheit");
			double faren = scan.nextDouble();
			
			double celsius = (5*(faren-32)/9);
			System.out.println("A temperatura em Celsius é de " + celsius +"°" );
		}
		
	}

}
