package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite três valores");
		
		double lado1 = scan.nextDouble();
		double lado2 = scan.nextDouble();
		double lado3 = scan.nextDouble();
		
		if ((lado1+lado2 > lado3) && (lado1==lado2) && (lado2==lado3)) {
			System.out.println("Estes valores são um Triângulo Equilátero");
		} else if ((lado1+lado2 > lado3) && (lado1==lado2) || (lado2==lado3)) {
			System.out.println("Estes valores são um Triângulo Isósceles");
		} else if ((lado1+lado2 > lado3) && (lado1!=lado2) && (lado2!=lado3)) {
			System.out.println("Estes valores são um Triângulo Escaleno");
		} else {
			System.out.println("Estes valores não podem ser um trângulo");

}
	}

}
