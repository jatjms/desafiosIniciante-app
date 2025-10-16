package operadores_logicos_and;

import java.util.Scanner;

public class aprovacao_no_curso {
    /*
     * Aprovação no Curso:
     * Para ser aprovado, um aluno precisa ter média >= 7 E frequência >= 75%.
     * O programa deve ler as 4 notas e a quantidade de faltas em cada bimestre.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=================== Informações das Notas Finais =========");
        System.out.print("Informe o valor da 1° Nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Informe o valor da 2° Nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Informe o valor da 3° Nota: ");
        double nota3 = input.nextDouble();
        System.out.print("Informe o valor da 4° Nota: ");
        double nota4 = input.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("\n=================== Informações de Faltas =========");
        System.out.print("Informe as faltas do 1° Bimestre: ");
        int faltas1 = input.nextInt();
        System.out.print("Informe as faltas do 2° Bimestre: ");
        int faltas2 = input.nextInt();
        System.out.print("Informe as faltas do 3° Bimestre: ");
        int faltas3 = input.nextInt();
        System.out.print("Informe as faltas do 4° Bimestre: ");
        int faltas4 = input.nextInt();

        int totalAulas = 60 * 4; // 60 dias por bimestre
        int totalFaltas = faltas1 + faltas2 + faltas3 + faltas4;
        double frequencia = 100 - ((totalFaltas * 100.0) / totalAulas);

        System.out.println("\n=================== Resultados =========");
        System.out.printf("Média final: %.2f%n", media);
        System.out.printf("Frequência: %.2f%%%n", frequencia);

        // Verificação com operador lógico AND
        if (media >= 7 && frequencia >= 75) {
            System.out.println("✅ Aluno APROVADO!");
        } else {
            System.out.println("❌ Aluno REPROVADO!");
        }

        input.close();
    }
}
