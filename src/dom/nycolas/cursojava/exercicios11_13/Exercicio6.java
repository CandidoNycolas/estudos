package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Digite o raio do círculo");
			double raio = scan.nextDouble();
			
			double resultado = Math.PI * (raio*raio);
			System.out.println("A área deste círculo é " + resultado);
			
			//Antes: 3.14 -> faltou usar classe Math para puxar o raio
			 //Opção: usar Math.pow para potência -> Classes utilitárias
		}
	}

}
