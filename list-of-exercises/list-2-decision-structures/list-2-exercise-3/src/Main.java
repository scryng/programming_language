import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("\nEntrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média for menor que 50 imprimir “Reprovado” caso contrário imprimir “Aprovado”.");

        int number1, number2;
        float media;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite a nota 1 (n1)");
        number1 = in.nextInt();

        System.out.println("\nDigite a nota 2 (n2)");
        number2 = in.nextInt();

        // Calculando a média
        media = (float)(number1 + number2) / 2;

        if (media < 10) {

            media = media * 10;

            if (media >= 50) {
                System.out.println("Aprovado com média: " + media);
            } else {
                System.out.println("Reprovado, média: " + media);
            }
        }
        else {
            if (media >= 50) {
                System.out.println("Aprovado com média: " + media);
            } else {
                System.out.println("Reprovado, média: " + media);
            }
        }
    }
}