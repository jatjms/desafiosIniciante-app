package com.desafio_iniciante_tipos_primitivo.java.dias;

import java.util.Scanner;

public class atividade01 {
	public static void main(String[] args) {
		/*
		 * Idade e Altura: Declare uma variável para armazenar sua idade (inteiro) e outra para sua altura em metros (decimal). Imprima os dois valores na tela.
		 */
		Scanner tipo_primitivo = new Scanner(System.in);
		
		System.out.println("Informe sua Idade.");
		int idade = tipo_primitivo.nextInt();
		
		System.out.println("Informe sua Altura.");
		double altura = tipo_primitivo.nextDouble();
		
		System.out.println("Sua idade é "+idade+" anos, sua altura é "+altura);
		
		tipo_primitivo.close();
	}
}
