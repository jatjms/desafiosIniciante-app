package manipulacao_basica_strings;

public class primeiro_ultimo_caractere {
	/*
	 * Primeiro e Último Caractere: Crie uma string e imprima o primeiro e o último caractere dela.
	 */
	public static void main(String[] args) {
	String palavra = "Java";
	
	char primeiro = palavra.charAt(0);
	char ultimo = palavra.charAt(palavra.length()-1);
	
	System.out.println("A palavra é: "+palavra);
	System.out.println("Primeiro caractere: "+primeiro);
	System.out.println("Ultimo caractere: "+ultimo);
	}
}
