import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber a base e a altura de um triângulo retângulo e calcular sua área.

        System.out.println("\nExercício 14: Receber a base e a altura de um triângulo retângulo e calcular sua área.");

        double base, altura, result;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o valor da base:");

        base = in.nextDouble();

        System.out.println("Digite o valor da altura:");

        altura = in.nextDouble();

        result = ((base * altura) / 2);

        System.out.println("A área é:\n" + result + "cm²");

    }
}