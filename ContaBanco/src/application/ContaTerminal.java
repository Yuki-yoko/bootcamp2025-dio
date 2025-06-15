package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		/**
		 * Atributo	Tipo	Exemplo
			Numero	Inteiro	1021
			Agencia	Texto	067-8
			Nome Cliente	Texto	MARIO ANDRADE
			Saldo	Decimal	237.48
			
			Mensagem final: Olá [Nome Cliente], obrigado por criar uma 
			conta em nosso banco, sua agência é [Agencia], conta [Numero] 
			e seu saldo [Saldo] já está disponível para saque".
		 */

		// Mensagens para saber o tipo de dado e a inserção dela 
		System.out.print("Por favor, digite o número da agencia! ");
		var numero = sc.nextInt();
		System.out.print("Por favor, digite a agencia! ");
		var agencia = sc.next();
		System.out.print("Por favor, digite seu nome! ");
		var nome = sc.next();
		sc.next();
		System.out.print("Por favor, digite o seu saldo! ");
		var saldo = sc.nextDouble();

		
		//Mensagem final
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %s já está disponível para saque", nome, agencia, numero, saldo);
		
		sc.close();
	}

}
