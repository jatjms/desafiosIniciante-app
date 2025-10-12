package com.desafio_iniciante_tipos_primitivo_declaracao.java.dias;

public class inteiro_decimal {
	/*
	 * De Inteiro para Decimal: Declare uma variável inteira com o valor 5. 
	 * Converta-a para um tipo decimal e imprima os dois valores.
	 */
	public static void main(String[] args) {
		int valorInteiro = 5;
		double valorDecimal = (double) valorInteiro;
		
		System.out.println("Valor Inteiro: "+valorInteiro);
		System.out.println("Valor Decimal: "+valorDecimal);
	}
}
