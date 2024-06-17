import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber os coeficientes a e b de uma equação do primeiro grau e imprimir a solução. Equação do primeiro grau: ax + b = 0.

        System.out.println("\nExercício 18: Receber os coeficientes a e b de uma equação do primeiro grau e imprimir a solução. Equação do primeiro grau: ax + b = 0. ");

        double coef_a, coef_b, solution;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o coeficiente a:");

        coef_a = in.nextDouble();

        System.out.println("Digite o coeficiente b");

        coef_b = in.nextDouble();

        solution = -coef_b / coef_a;

        System.out.println("Solução: " + solution);
        // System.out.println(a + "X + (")");

    }
}