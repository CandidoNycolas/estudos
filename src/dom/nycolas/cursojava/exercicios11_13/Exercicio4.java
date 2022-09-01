package dom.nycolas.cursojava.exercicios11_13;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Digite a nota do 1º bimestre");
			double nota1 = scan.nextDouble();
			System.out.println("Digite a nota do 2º bimestre");
			double nota2 = scan.nextDouble();
			System.out.println("Digite a nota do 3º bimestre");
			double nota3 = scan.nextDouble();
			System.out.println("Digite a nota do 4º bimestre");
			double nota4 = scan.nextDouble();
			
			double media = (nota1 + nota2 + nota3 + nota4) / 4;
			System.out.println("A média dos 4 bimestres é: " + media);
		}
		
		
		
	}

}
