import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida de distância em quilômetros e converter para milhas.

        System.out.println("\nExercício 9: Ler uma medida de distância em quilômetros e converter para milhas.");

        double kmh, milhas;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em Km/h:");

        kmh = in.nextDouble();

        milhas = kmh / 1.609;

        System.out.println("A mesma medida em milhas é:\n" + milhas);

    }
}