import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma velocidade em Km/h e converter para m/s.

        System.out.println("\nExercício 5: Ler uma velocidade em Km/h e converter para m/s.");

        double kmh, ms;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em Km/h:");

        kmh = in.nextDouble();

        ms = kmh / 3.6;

        System.out.println(kmh + " Km/h em m/s é:\n" + ms);

    }
}