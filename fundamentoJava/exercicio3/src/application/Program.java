package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/**
		 Escreva um código que receba a base e a alturade um retângulo, 
		 calcule sua área e exiba na tela

						fórmula: área=base X altura
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("CÁLCULO DA ÁREA DO RETÂNGULO: ");
		System.out.print("Informe o tamanho da base: ");
		var base = sc.nextDouble();
		
		System.out.print("Informe o tamanho da altura: ");
		var altura = sc.nextDouble();
		
		//calculo:
		var resultado = base * altura;
		System.out.println();
		
		//Saída do programa:
		System.out.printf("fórmula : %s * %s = %s", base, altura, resultado);
		
		sc.close();
	}

}
