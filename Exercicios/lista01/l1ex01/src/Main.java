import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler um número inteiro e exibir o seu dobro.

        System.out.println("\nExercício 1: Ler um número inteiro e exibir o seu dobro.");

        int number, result;

        Scanner in = new Scanner(System.in);

        // System.out.println("");
        System.out.println("\nDigite um número inteiro:");

        number = in.nextInt();

        result = 2 * number;

        System.out.println("O dobro de " + number + " é:\n" + result);

    }
}