package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número");
		double valor = scan.nextDouble();
		
		if (valor >= 0) {
			System.out.println("Este número é positivo");
		} else if (valor < 0) {
			System.out.println("Este número é negativo");
		}
	}

}
