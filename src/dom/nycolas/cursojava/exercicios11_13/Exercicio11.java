package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner (System.in)) {
			System.out.println("Digite dois números inteiros (separe-os com espaço)");
			 int valor1 = scan.nextInt();
			 int valor2 = scan.nextInt();
			 
			 System.out.println("Digite um número real");
			 double valor3 = scan.nextDouble();
			 
			 System.out.println("Você digitou os seguintes valores: ");
			 System.out.println("Primeiro número: " + valor1);
			 System.out.println("Segundo número: " + valor2);
			 System.out.println("Terceiro número: " + valor3);
			 
			 int resultado1 = (valor1*2)*(valor2/2);
			 double resultado2 = (valor1*3)+valor3; 
			 double resultado3 = Math.pow (valor3, 3);
			 //Mudei para Math.pow
			 
			 System.out.println("O produto do dobro do primeiro número com a metade do segundo é igual a: " + resultado1);
			 System.out.println("A soma do triplo do primeiro número com o terceiro número é igual a: " + resultado2);
			 System.out.println("O terceiro número elevado ao cubo é igual a: " + resultado3);
		}
		 
	} 

}
