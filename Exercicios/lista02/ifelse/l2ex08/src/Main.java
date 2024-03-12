import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nExercício 8");

        // Variáveis

        int number;

        // Scanner

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o número inteiro");
        number = in.nextInt();

        if (number % 2 == 0)
            System.out.println("\nPar");
        else
            System.out.println("\nImpar");
    }
}