package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite o valor do primeiro produto");
			double valor1 = scan.nextDouble();
			System.out.println("Digite o valor do segundo produto");
			double valor2 = scan.nextDouble();
			System.out.println("Digite o valor do terceiro produto");
			double valor3 = scan.nextDouble();
			
			double menor = valor1;
			
			if (valor2<menor)
				menor=valor2;
			if (valor3<menor)
				menor=valor3;
				
			System.out.println("Compre o produto que custa" + menor);
		}	
	}

}
