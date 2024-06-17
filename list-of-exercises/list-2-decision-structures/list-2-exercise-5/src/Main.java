import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float number1, number2, number3;
        float media;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o valor da nota 1 (0 a 10)");
        number1 = in.nextInt();

        System.out.println("\nDigite o valor da nota 2 (0 a 10)");
        number2 = in.nextInt();

        // Calculando a média
        media = (float)(number1 + number2) / 2;

        if (media > 10) {
            System.out.println("\nNotas maiores que 10, informe somente notas de 0 a 10");
        } else if (media >= 8.5) {
            System.out.println("\nA");
        } else if (media >= 7 && media < 8.5) {
            System.out.println("\nB");
        } else if (media >= 5 && media < 7) {
            System.out.println("\nC");
        } else {
            System.out.println("\nD");
        }
    }
}