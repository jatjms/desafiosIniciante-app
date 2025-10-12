package com.desafio_iniciante_string_caracter.dias;

import java.util.Scanner;

public class atividades02 {
	
	/*
	 * Inicial do Nome: Declare uma variável do tipo caractere para armazenar a primeira letra do seu nome e imprima-a.
	 */
	
	public static void main(String[] args) {
		Scanner nomeCaractere = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		char inicial = nomeCaractere.next().charAt(0);
		
		System.out.print("A 1° Letra do seu nome é: "+inicial);
		
		nomeCaractere.close();
	}
}
