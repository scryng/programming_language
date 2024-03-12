import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida de distância em milhas e converter para quilômetros.

        System.out.println("\nExercício 10: Ler uma medida de distância em milhas e converter para quilômetros.");

        double milhas, kmh;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em milhas:");

        milhas = in.nextDouble();

        kmh = milhas * 1.609;

        System.out.println("A mesma medida em Km/h é:\n" + kmh);

    }
}