package operadores_relacionais;

import java.util.Scanner;

public class maioridade {
	/*
	 * Maioridade: Crie uma variável idade e verifique se a pessoa é maior de idade (idade >= 18). 
	 * Imprima true se for maior de idade e false caso contrário.
	 */
	public static void main(String[] args) {
		Scanner idade = new Scanner(System.in);
		System.out.println("Digite sua Idade.");
		int idadeMaior = idade.nextInt();
		
		if (idadeMaior >= 18) {
			System.out.println("Você é maior de Idade tendo "+idadeMaior+" idade.");
		}else if (idadeMaior < 18 ) {
			System.out.println("Você é menor de Idade tendo "+idadeMaior+" idade.");
		}else {
			System.out.println("Dados de sua idade estão incorretos");
		}		
		idade.close();
	}
}
