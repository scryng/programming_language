import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma velocidade em m/s e converter para km/h.

        System.out.println("\nExercício 6: Ler uma velocidade em m/s e converter para km/h.");

        double ms, kmh;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a velocidade em m/s:");

        ms = in.nextDouble();

        kmh = ms * 3.6;

        System.out.println(ms + " m/s em Km/h é:\n" + kmh);

    }
}