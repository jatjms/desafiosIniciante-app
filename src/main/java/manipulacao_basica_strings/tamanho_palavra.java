package manipulacao_basica_strings;

public class tamanho_palavra {
	/*
	 * Tamanho da Palavra: Crie uma string com uma palavra à sua escolha e imprima o número de caracteres que ela possui.
	 */
	public static void main(String[] args) {
		String palavra = "Aprendendo Java";
		int tamanho = palavra.length();
		
		System.out.println("A frase \""+palavra+"\" possui "+tamanho+" caracteres.");
	}
}
