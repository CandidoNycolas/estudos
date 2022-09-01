package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite um número");
			double valor1 = scan.nextDouble();
			System.out.println("Digite um segundo número");
			double valor2 = scan.nextDouble();
			System.out.println("Digite um terceiro número");
			double valor3 = scan.nextDouble();
			
			double menor;
	        double maior;

	        maior = Math.max(valor2,Math.max(valor3,valor1));
	        menor = Math.min(valor2,Math.min(valor3,valor1));
	        
	        if ((maior == valor1)&&(menor == valor2)) {
				System.out.println("A ordem decrescente é " + valor1 + valor3 + valor2);
	        }else if ((maior == valor1)&&(menor == valor3)) {
				System.out.println("A ordem decrescente é " + valor1 + valor2 + valor3);
	        }else if ((menor == valor1)&&(maior == valor2)) {
				System.out.println("A ordem decrescente é " + valor2 + valor3 + valor1);
	        }else if ((menor == valor1)&&(maior == valor3)) {
				System.out.println("A ordem decrescente é " + valor3 + valor2 + valor1);
	        }else if ((maior == valor2)&&(menor == valor1)) {
				System.out.println("A ordem decrescente é " + valor2 + valor3 + valor1);
	        }else if ((maior == valor2)&&(menor == valor3)) {
				System.out.println("A ordem decrescente é " + valor2 + valor1 + valor3);
	        }else if ((menor == valor2)&&(maior == valor1)) {
				System.out.println("A ordem decrescente é " + valor1 + valor3 + valor2);
	        }else if ((menor == valor2)&&(maior == valor3)) {
				System.out.println("A ordem decrescente é " + valor3 + valor1 + valor2);
			if ((maior == valor3)&&(menor == valor1)) {
				System.out.println("A ordem decrescente é " + valor3 + valor2 + valor1);
	        }else if ((maior == valor3)&&(menor == valor2)) {
				System.out.println("A ordem decrescente é " + valor3 + valor1 + valor2);
	        }else if ((menor == valor3)&&(maior == valor1)) {
				System.out.println("A ordem decrescente é " + valor3 + valor2 + valor1);
	        }else if ((menor == valor3)&&(maior == valor2)) {
				System.out.println("A ordem decrescente é " + valor2 + valor1 + valor3);
	        
			/*if ((valor1>valor2)&&(valor1>valor3)) {
				System.out.println("A ordem decrescente é " + valor1 + valor2 + valor3);
			}else if ((valor1>valor3)&&(valor1>valor2)) {
				System.out.println("A ordem decrescente é " + valor1 + valor3 + valor2);
			}else if ((valor1<valor3)&&(valor1>valor2)) {
				System.out.println("A ordem decrescente é " + valor3 + valor1 + valor2);
			}else if ((valor1<valor3)&&(valor1<valor2)) {
				System.out.println("A ordem decrescente é " + valor2 + valor3 + valor1);
			}else if ((valor1>valor3)&&(valor1>valor2)) {
				System.out.println("A ordem decrescente é " + valor1 + valor3 + valor2);
			}else if ((valor2>valor1)&&(valor2>valor3)) {
				System.out.println("A ordem decrescente é " + valor2 + valor1 + valor3);
			}else if ((valor3>valor1)&&(valor3>valor2)) {
				System.out.println("A ordem decrescente é " + valor3 + valor1 + valor2);
			}*/
	}
	}
		}
	}
}
