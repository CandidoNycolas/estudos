package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			double valor1 = scan.nextDouble();
			System.out.println("Digite um segundo número");
			double valor2 = scan.nextDouble();
			System.out.println("Digite um terceiro número");
			double valor3 = scan.nextDouble();
			
			double maior = valor1;
			double menor = valor1;
			
			if (valor2>maior)
				maior=valor2;
			if (valor3>maior)
				maior=valor3;
			if (valor2<menor)
				menor=valor2;
			if (valor3<menor)
				menor=valor3;
				
			System.out.println("O maior número é " + maior + "O menor número é " + menor);
		}	
		}
}
