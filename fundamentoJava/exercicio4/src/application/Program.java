package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/**
		 Escreva um código que receba o nome e a idade de 2 pessoas e 
		 imprima a diferença de idade entre elas
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o nome da primeira pessoa: ");
		var nome1 = sc.next();
		System.out.print("Informe a idade da primeira pessoa: ");
		var idade1 = sc.nextInt();
		
		System.out.println();
		
		System.out.print("Informe o nome da segunda pessoa: ");
		var nome2 = sc.next();
		System.out.print("Informe a idade da segunda pessoa: ");
		var idade2 = sc.nextInt();
		
		System.out.println();
		
		int diferenca;
		
		if (idade1 > idade2) {
			diferenca = idade1 - idade2;
		}
		else {
			diferenca = idade2 - idade1;
		}
		
		System.out.printf("A diferença de idade entre %s que tem %s anos e %s que tem %s anos é de %s",nome1, idade1, nome2, idade2, diferenca );
		
		sc.close();
	}

}
