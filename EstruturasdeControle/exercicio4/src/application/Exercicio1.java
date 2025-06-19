package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Digite o número: ");
		int numero = sc.nextInt();
		
		int resto = numero % 2;
		System.out.printf("%d %% 2 = %d\n", numero, resto);
		if (resto != 0) {
			System.out.println("Esse número é ignorado.");
		}
		
		while (resto == 0) {
			System.out.println();
			System.out.print("Digite o número: ");
			numero = sc.nextInt();
			resto = numero % 2;
			System.out.printf("%d %% 2 = %d\n", numero, resto);
			
			if (resto != 0) {
				System.out.println("Esse número é ignorado.");
				break;
			}
		}
		
			
		sc.close();
	}

}
