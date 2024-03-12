import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler duas notas N1 e N2 e exibir a média. Obs.: N1 tem peso 1 e N2 tem peso 2. Obs.: O resultado deve estar entre 0 e 10.

        System.out.println("\nExercício 12: Ler duas notas N1 e N2 e exibir a média. Obs.: N1 tem peso 1 e N2 tem peso 2. Obs.: O resultado deve estar entre 0 e 10.");

        double n1, n2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o valor da nota N1 (O valor precisa ser entre 0 e 10):");

        n1 = in.nextDouble();

        if (n1 > 10 || n1 < 0) {
            System.out.println("\nO valor da nota N1 precisa ser de 0 a 10");
            return;
        }

        System.out.println("Digite o valor da nota N2 (O valor precisa ser entre 0 e 10):");

        n2 = in.nextDouble();

        if (n2 > 10 || n2 < 0) {
            System.out.println("\nO valor da nota N2 precisa ser de 0 a 10");
            return;
        }

        n2 = n2 * 2;

        result = ((n1 + n2) / 2);

        System.out.println("A média é:\n" + result);

    }
}