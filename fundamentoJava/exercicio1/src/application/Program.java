package application;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/**
		 Escreva um código que receba o nome e o ano de nascimento de alguém e 
		 imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		var name = sc.next();
		
		System.out.print("Informe o ano de nascimento: ");
		var bornYear = sc.nextInt();
		
		var nowYear = OffsetDateTime.now().getYear();
		
		var age = nowYear - bornYear;
		
		System.out.printf("Olá, %s você tem %s anos", name, age);
	}

}
