import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nExercício 20: Descobrir uma equação do segundo grau a partir de suas raízes:");

        System.out.println("\nDigite o valor de x1:");
        double x1 = in.nextDouble();

        System.out.println("Digite o valor de x2:");
        double x2 = in.nextDouble();

        double coef_a = 1;
        double coef_b = -(x1 + x2);
        double coef_c = x1 * x2;

        System.out.println("Equação do segundo grau: " + coef_a + "x^2 + (" + coef_b + ")x + (" + coef_c + ") = 0");
    }
}