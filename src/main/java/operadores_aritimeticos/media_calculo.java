package operadores_aritimeticos;

import java.util.Scanner;

public class media_calculo {
	/*
	 * Calculadora de Média: Declare três variáveis numéricas (n1, n2, n3). Calcule e imprima a média aritmética delas.
	 */
	public static void main(String[] args) {
		Scanner mediaEscola = new Scanner(System.in);
				
		
		System.out.println("Informe o valor a 1° Nota.");
		double nota1 = mediaEscola.nextDouble();
		
		System.out.println("Informe o valor a 2° Nota.");
		double nota2 = mediaEscola.nextDouble();
		
		System.out.println("Informe o valor a 3° Nota.");
		double nota3 = mediaEscola.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
		
		System.out.println("Sua média é: "+media);
		
		mediaEscola.close();
		
	}
}
