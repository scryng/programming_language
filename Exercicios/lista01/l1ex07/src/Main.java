import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler uma medida em milímetro e converter para polegadas.

        System.out.println("\nExercício 7: Ler uma medida em milímetro e converter para polegadas.");

        double mili, pol;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a medida em milímetros:");

        mili = in.nextDouble();

        pol = mili / 25.4;

        System.out.println("A mesma medida em polegadas é:\n" + pol);

    }
}