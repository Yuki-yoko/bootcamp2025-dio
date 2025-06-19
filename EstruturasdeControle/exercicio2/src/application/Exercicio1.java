package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite a dua altura: ");
		double altura = sc.nextDouble();
		System.out.print("Digite o seu peso: ");
		double peso = sc.nextDouble();
		
		double imc = peso / (altura * altura);
		
		if (imc <= 18.5) {
			System.out.println("Abaixo de peso");
		}
		else if (18.6 <= imc && imc <= 24.9) {
			System.out.println("Peso ideal");
		}
		else if (25.0 <= imc && imc <= 29.9) {
			System.out.println("Levemente acima do peso");
		}
		else if (30.0 <= imc && imc <= 34.9) {
			System.out.println("Obesidade grau I");
		}
		else if (35.0 <= imc && imc <= 39.9) {
			System.out.println("Obesidade Grau II (Severa)");
		}
		else if (imc >= 40.0 ) {
			System.out.println("Obesidade III (Mórbida)");
		}
		
		
		
		sc.close();
	}

}
