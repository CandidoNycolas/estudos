package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Digite a medida do lado do quadrado");
		double lado = scan.nextDouble();
		
		double resultado = Math.pow (lado, 2); //Mudei para o Math.pow
		double resultadoDobro = resultado * 2;
		System.out.println("A área deste quadrado é: " + resultado);
		System.out.println("O dobro da área deste quadrado é: " + resultadoDobro);
		//Opção: ("O dobor da área deste quadra é: " + (area*2));
	}


	}

}
