package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		/**
		 Escreva um código que receba o tamanho do lado de um quadrado, 
		 calcule sua área e exiba na tela
				fórmula: área=lado X lado
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("CÁLCULO DA ÁREA DO QUADRADO: ");
		System.out.print("Informe o tamanho do lado: ");
		var lado = sc.nextDouble();
		
		//calculo:
		var resultado = lado * lado;
		System.out.println();
		
		//Saída do programa:
		System.out.printf("fórmula : %s * %s = %s", lado, lado, resultado);
		
	}

}
