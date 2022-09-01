package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Qual o tamanho do arquivo em MB?");
			double tam = scan.nextDouble();
			
			System.out.println("Qual a velocidade da internet em Mbps?");
			double vel = scan.nextDouble();
			
			double resultado = tam / vel; //Erro: coloquei multiplicação
			
			System.out.println("O tempo de download é de: " + resultado + " minutos");
		}	//Erro: entendi que era pra multiplicar por 60
		
			
		
	}

}
