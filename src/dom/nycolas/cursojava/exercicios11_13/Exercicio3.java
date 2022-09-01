package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
	
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Digite o primeiro número");
		int valor1 = scan.nextInt();
		
		System.out.println("Digite o segundo número");
		int valor2 = scan.nextInt();
		
		int resultado = valor1 + valor2;
		System.out.println("A soma dos números é: " + resultado);
		}

		
	}

}
