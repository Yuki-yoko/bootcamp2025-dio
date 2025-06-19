package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/**
		 * Escreva um código que o usuário entre com um primeiro número, 
		 * um segundo número maior que o primeiro e escolhe entre a opção 
		 * par e impar, com isso o código deve informar todos os números 
		 * pares ou ímpares (de acordo com a seleção inicial) no intervalo 
		 * de números informados, incluindo os números informados e em ordem 
		 * decrescente;
		 */
		
		System.out.print("Digite o número inicial: ");
		var initNumero = sc.nextInt();
		System.out.print("Digite o segundo número: ");
		var finalNumero = sc.nextInt();
		
		System.out.println();
		
		while (finalNumero < initNumero) {
			System.out.print("AVISO: o seu número final deve ser maior que o inicial.\n "
					+ "Tente novamente: ");
			finalNumero = sc.nextInt();
		}
		
		System.out.print("Como deseja ordenar? (par/ímpar) ");
		var tipo = sc.next();
		
		if (tipo.equalsIgnoreCase("par")) {
			for (int i = finalNumero; i >= initNumero; i--) {
				if (i % 2 == 0) {
					System.out.println(i);
				}
			}
		}
		else if (tipo.equalsIgnoreCase("ímpar")) {
			for (int i = finalNumero; i >= initNumero; i--) {
				if (i % 2 == 1) {
					System.out.println(i);
				}
			}
		}
				
			
		sc.close();
	}

}
