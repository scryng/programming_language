import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler um número real e exibir a quinta parte deste número.

        System.out.println("\nExercício 3: Ler um número real e exibir a quinta parte deste número.");

        double number, result;

        Scanner in = new Scanner(System.in);

        // System.out.println("");
        System.out.println("Digite um número real:");

        number = in.nextDouble();

        result = number / 5;

        System.out.println("A quinta parte de " + number + " é:\n" + result);

    }
}