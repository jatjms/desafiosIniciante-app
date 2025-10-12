package com.desafio_iniciante_string_caracter.dias;

import java.util.Scanner;

public class atividades03 {
	/*
	 * Saudação: Crie duas strings, uma com seu primeiro nome e outra com seu sobrenome. Concatene (junte) 
	 * as duas com um espaço no meio para formar seu nome completo e imprima o resultado.
	 */
	public static void main(String[] args) {
		Scanner saudacao = new Scanner(System.in);
			
		System.out.print("Digite seu 1° Nome: ");
		String primeiroNome = saudacao.nextLine();
		
		System.out.print("Digite seu Sobre Nome: ");
		String sobreNome = saudacao.nextLine();
			
		System.out.print("Seu nome: "+primeiroNome+" "+sobreNome);
		
		saudacao.close();
	}
}
