package com.desafio_iniciante_tipos_primitivo.java.dias;

import java.util.Scanner;

public class atividade02 {
	/*
	 * Soma Simples: Crie duas variáveis inteiras, numero1 e numero2, com valores de sua escolha. 
	 * Crie uma terceira variável, soma, que armazene a soma das duas primeiras. Imprima o resultado.
	 */
	public static void main(String[] args) {
		Scanner somaSimples = new Scanner(System.in);
		
		System.out.println("Digitem um número.");
		int num1 = somaSimples.nextInt();
		
		System.out.println("Digitem outro número.");
		int num2 = somaSimples.nextInt();
		
		int soma = num1 + num2;
		
		System.out.println("Número 1 = "+num1+", número 2 = "+num2+", Soma = "+soma+".");
		
		
		somaSimples.close();
	}
}
