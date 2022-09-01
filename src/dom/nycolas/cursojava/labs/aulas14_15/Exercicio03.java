package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		System.out.println("Indique seu gênero (Use M para masculino e F para feminino)");
		
		
		String genero = scan.next();
		

		switch(genero) {
			case "M":
			System.out.println("Masculino"); break;
			case "F":
			System.out.println("Feminino"); break;
			default:
			System.out.println("Gênero inválido");
		}
		}
		
	}
