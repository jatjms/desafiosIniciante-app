package operadores_aritimeticos;

import java.util.Scanner;

public class par_impar {
	/*
	 * Par ou Ímpar: Crie uma variável inteira e use o operador de módulo (%) 
	 * para verificar se o número é par ou ímpar. Um número é par se o resto da sua divisão por 2 for 0. 
	 * Imprima uma mensagem indicando o resultado (ex: "O número X é par").
	 */
	public static void main(String[] args) {
		Scanner parImpar = new Scanner(System.in);
		System.out.println("Digite um número.");
		double num1 = parImpar.nextDouble();
		
		int resto = (int) num1%2;
		
		if (resto > 0) {
			System.out.println("Esse é impar "+num1);
		}else if(resto == 0){
			System.out.println("Esse é par "+num1);
		}else {
			System.out.println("Então errei a logica");
		}
		
		parImpar.close();
	}
}
