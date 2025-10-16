package operadores_relacionais;

import java.util.Scanner;

public class comparacao_de_numeros {
	/*
	 * Comparação de Números: Declare duas variáveis numéricas, a e b. 
	 * Compare-as e imprima mensagens indicando se a é maior, menor ou igual a b.
	 */
	public static void main(String[] args) {
		Scanner maiorNumero = new Scanner(System.in);
		
		System.out.println("Digite um 1º número.");
		int num1 = maiorNumero.nextInt();
		
		System.out.println("Digite um 2º número.");
		int num2 = maiorNumero.nextInt();
		
		if(num1>num2) {
			System.out.println("O 1º número: "+num1+", é maior que o 2°: "+num2);
		}else if(num1<num2) {
			System.out.println("O 1º número: "+num1+", é menor que o 2°: "+num2);
		}else if(num1 == num2) {
			System.out.println("O 1º número: "+num1+", é igual que o 2°: "+num2);
		}else if(num1 < 0 || num2 <0) {
			System.out.println("Ambos são menores que 0(zero)"+num1+","+num2);			
		}else {
			System.out.println("Dados incorretos");
		}
		maiorNumero.close();
	}
}
