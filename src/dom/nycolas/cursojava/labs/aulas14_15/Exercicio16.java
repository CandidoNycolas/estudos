package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor de a");
		double a = scan.nextDouble();
		System.out.println("Informe o valor de b");
		double b = scan.nextDouble();
		System.out.println("Informe o valor de c");
		double c = scan.nextDouble();
			
		double delta = ((Math.pow (b, 2)) - (4*a*c));
		double x1 = (-b + (Math.sqrt(delta))/2*a); 
		double x2 = (-b - (Math.sqrt(delta))/2*a);
		
		
		if (delta == 0) {
			System.out.println("Esta equação possui apenas uma raíz real. A raíz é: " + x1);
		} else if (delta > 0) {
			System.out.println("As raízes desta equação são: " + x1 + " e " + x2);
		} else if (a == 0) {
			System.out.println("Esta não é uma equação do segundo grau");
			System.exit(0);
		} else if (delta == 0) {
			System.out.println("Esta equação não possui raízes reais");
			System.exit(0);
			}
		}

}
