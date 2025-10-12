package com.desafio_iniciante_string_caracter.dias;

import java.util.Scanner;

public class atividades01 {
	/*
	 * Nome Completo: Declare uma variável do tipo string para armazenar seu nome completo e imprima-a.
	 */
	public static void main(String[] args) {
		Scanner nome_complete = new Scanner(System.in);
		
		System.out.print("Digite seu Nome completo: ");
		String nomeComplete = nome_complete.nextLine();
		
		System.out.println("Seu nome completo é: "+nomeComplete);
		
		nome_complete.close();
	}	
}
