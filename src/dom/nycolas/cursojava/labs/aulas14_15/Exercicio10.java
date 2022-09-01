package dom.nycolas.cursojava.labs.aulas14_15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {
			
			System.out.println("Em que turno você estuda? Digite 'M' para Matutino, 'V' para Vespertino e 'N' para Noturno");
			
			String turno = scan.next();
			
			switch(turno) {
			case "M":
			System.out.println("Bom dia!"); break;
			case "V":
			System.out.println("Boa tarde!"); break;
			case "N":
			System.out.println("Boa noite!"); break;
			default:
			System.out.println("Valor inválido");
		}
		}
	}
}
