import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber o raio e um círculo e calcular sua área.

        System.out.println("\nExercício 13: Receber o raio e um círculo e calcular sua área.");

        double raio, result;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o valor do raio:");

        raio = in.nextDouble();

        double pi = 3.141592653;

        result = (pi * (raio * raio));

        System.out.println("A área é:\n" + result + "cm²");

    }
}