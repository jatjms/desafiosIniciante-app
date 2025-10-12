package com.desafio_iniciante_tipos_primitivo_declaracao.java.dias;

public class media_notas {
	/*
	 * Média de Notas: Declare uma variável inteira nota1 e outra nota2. 
	 * Calcule a média. Garanta que o resultado seja um número decimal, mesmo que a soma seja par. Imprima o resultado.
	 */
	public static void main(String[] args) {
		int  nota1 = 10;
		int nota2 = 3;
		int soma = nota1 + nota2;
		
		double media = (double)soma/2;		
		
		System.out.println("A média das notas é: "+media);
	}
}
