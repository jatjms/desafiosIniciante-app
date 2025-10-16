package operadores_relacionais;

import java.util.Scanner;

public class senhaCorreta {
	/*
	 * Senha Correta:
	 * Crie uma variável senhaArmazenada e outra senhaDigitada.
	 * Compare as duas para ver se são iguais.
	 * Imprima true se a senha estiver correta e false se estiver incorreta.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String senhaArmazenada = "java123"; // Senha real armazenada no sistema
		
		System.out.print("Digite sua senha: ");
		String senhaDigitada = entrada.nextLine(); // lê a senha do usuário
		
		boolean senhaCorreta = senhaDigitada.equals(senhaArmazenada); // compara as strings
		
		System.out.println("Senha correta? " + senhaCorreta);
		
		entrada.close();
	}
}
