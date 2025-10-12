package com.desafio_iniciante_tipos_primitivo_declaracao.java.dias;

public class decimal_inteiro {
	/*
	 * De Decimal para Inteiro: Declare uma variável decimal com o valor 9.99. 
	 * Converta-a explicitamente para um tipo inteiro e imprima os dois valores. Note o que acontece com a parte fracionária.
	 */
	public static void main(String[] args) {
		double valorDecimal = 9.99;
		int valorInteiro = (int) valorDecimal;
		
		System.out.println("Valor Decimal: "+valorDecimal);
		System.out.println("Valor Inteiro: "+valorInteiro);
	}
}
