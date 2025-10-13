package operadores_aritimeticos;

import java.util.Scanner;

public class conversor_temperatura {
	/*
	 * Conversor de Temperatura: Crie uma variável celsius e converta seu valor para Fahrenheit. 
	 * A fórmula é: F = C * 1.8 + 32. Imprima o resultado.
	 */
	public static void main(String[] args) {
		Scanner temperatura = new Scanner(System.in);
		double c,f;
		
		System.out.println("");
		c = temperatura.nextDouble();
		
		f = (c*1.8) + 32;
		
		System.out.println("Sua Temperatura em Fahrenheit é: "+f) ;
		
		temperatura.close();		
	}
}
