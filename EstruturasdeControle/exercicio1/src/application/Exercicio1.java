package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/**
		 * Escreva um código onde o usuário entra com um número e 
		 * seja gerada a tabuada de 1 até 10 desse número;
		 */
		
		System.out.print("Qual tabuada deseja que seja calculado? ");
		int numero = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int resultado = i * numero;
			System.out.printf("%d * %d = %d\n", numero, i, resultado);
		}
		
		
		
		
		
		
		sc.close();
	}

}
