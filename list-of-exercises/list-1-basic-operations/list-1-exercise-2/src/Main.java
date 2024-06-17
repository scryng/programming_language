import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler um número inteiro e exibir o seu quadrado.

        System.out.println("\nExercício 2: Ler um número inteiro e exibir o seu quadrado.");

        int number, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");

        number = in.nextInt();

        result = number * number;
        // result = Math.pow(number,2);

        System.out.println("O quadrado de " + number + " é:\n" + result);

    }
}