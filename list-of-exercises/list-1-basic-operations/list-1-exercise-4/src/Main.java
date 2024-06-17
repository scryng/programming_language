import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ler duas notas N1 e N2 e exibir a média.

        System.out.println("\nExercício 4: Ler duas notas N1 e N2 e exibir a média.");

        int n1, n2, result;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da nota N1:");

        n1 = in.nextInt();

        System.out.println("Digite o valor da nota N2:");

        n2 = in.nextInt();

        result = (n1 + n2) / 2;

        System.out.println("A média entre " + n1 + " e " + n2 + " é:\n" + result);

    }
}