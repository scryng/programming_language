import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nReceber os coeficientes a, b e c de uma equação do segundo grau e imprimir a solução (x1 e x2). Equação do segundo grau: ax 2+bx+c=0. Exibir uma mensagem de aviso quando não houver raízes no conjunto de números Reais.");

        double coef_a, coef_b, coef_c, delta, x1, x2;

        Scanner in = new Scanner(System.in);

        System.out.println("\nCoeficiente a");
        coef_a = in.nextDouble();

        System.out.println("\nCoeficiente b");
        coef_b = in.nextDouble();

        System.out.println("\nCoeficiente c");
        coef_c = in.nextDouble();

        delta = Math.pow(coef_b, 2) - 4*coef_a*coef_c;

        if (delta < 0) {
            System.out.println("\nEquação sem raiz");
        } else {
            x1 = (coef_b*-1 + Math.sqrt(delta))/(2*coef_a);
            x2 = (coef_b*-1 - Math.sqrt(delta))/(2*coef_a);
            System.out.println("\nx1 = " + x1 + " e x2 = " + x2);
        }

    }
}