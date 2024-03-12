import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber os coeficientes a, b e c de uma equação do segundo grau e imprimir a solução
        System.out.println("\nExercício 19: Receber os coeficientes a, b e c de uma equação do segundo grau e imprimir a solução. Equação do segundo grau: ax^2 + bx + c = 0");

        double coef_a, coef_b, coef_c, solution1, solution2;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o coeficiente a:");
        coef_a = in.nextDouble();

        System.out.println("Digite o coeficiente b:");
        coef_b = in.nextDouble();

        System.out.println("Digite o coeficiente c:");
        coef_c = in.nextDouble();

        // Calculando o delta
        double delta = coef_b * coef_b - 4 * coef_a * coef_c;

        // Verificando as condições para as raízes
        if (delta > 0) {
            // Duas raízes reais e distintas
            solution1 = (-coef_b + Math.sqrt(delta)) / (2 * coef_a);
            solution2 = (-coef_b - Math.sqrt(delta)) / (2 * coef_a);
            System.out.println("Soluções: x1 = " + solution1 + ", x2 = " + solution2);
        } else if (delta == 0) {
            // Uma raiz real única
            solution1 = -coef_b / (2 * coef_a);
            System.out.println("Solução única: x = " + solution1);
        } else {
            // Nenhuma raiz real
            System.out.println("A equação não possui raízes reais.");
        }
    }
}
