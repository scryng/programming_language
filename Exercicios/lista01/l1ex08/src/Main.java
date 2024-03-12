import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida em polegadas e converter para milímetros.

        System.out.println("\nExercício 8: Ler uma medida em polegadas e converter para milímetros.");

        double pol, mili;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em polegadas:");

        pol = in.nextDouble();

        mili = pol * 25.4;

        System.out.println("A mesma medida em milímetros é:\n" + mili);

    }
}