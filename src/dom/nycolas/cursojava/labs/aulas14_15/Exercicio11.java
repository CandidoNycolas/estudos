package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu salário");
		
		double salario = scan.nextDouble();
		double porcentagem = 0;
		double aumento = 0;
		
		
		if (salario <= 280)
			porcentagem = 20;
			aumento = salario*porcentagem/100;
		if ((salario > 280) && (salario <= 700))
			porcentagem = 15; 
			aumento = salario*porcentagem/100;
		if ((salario > 700) && (salario <= 1500))
			porcentagem = 10;
			aumento = salario*porcentagem/100;
		if (salario > 1500)
			porcentagem = 5;
			aumento = salario*porcentagem/100;
			
			System.out.println("Seu salário é de R$" + salario + ". Você recebeu um aumento de " + porcentagem + "%, o que equivale a mais R$" + aumento + " no seu salário. Seu novo salário é de R$" + (salario+aumento));
			
		}
		
	}
