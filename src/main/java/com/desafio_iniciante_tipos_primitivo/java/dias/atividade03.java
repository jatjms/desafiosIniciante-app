package com.desafio_iniciante_tipos_primitivo.java.dias;

import java.util.Scanner;

public class atividade03 {
	/*
	 * Área de um Retângulo: Declare duas variáveis, base e altura, para um retângulo. 
	 * Calcule a área (base * altura) e armazene em uma variável area. Imprima o valor da área
	 */
	public static void main(String[] args) {
		Scanner areaRetangulo = new Scanner(System.in);
		
		System.out.println("Programa: Calcular área de um Retangulo.");
		System.out.println("========================================");
		
		System.out.print("Informa a altura do seu retangulo.");
		float altura = areaRetangulo.nextFloat();
		
		System.out.print("Informa a base do seu retangulo.");
		float base = areaRetangulo.nextFloat();
		
		float retangulo = base * altura;
		
		System.out.println("Área do Retangulo é "+retangulo);
		
		areaRetangulo.close();
	}
}
