import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("\n. O usuário entra com dois números inteiros e o programa indica qual o maior.”");

        int number1, number2;

        Scanner in = new Scanner(System.in);

        // System.out.println("");
        System.out.println("\nDigite um número inteiro");
        number1 = in.nextInt();

        System.out.println("\nDigite outro número inteiro");
        number2 = in.nextInt();

        if (number1 > number2) {
            System.out.println("O primeiro número é o maior número: " + number1);
        } else
            System.out.println("O segundo número é o maior número: " + number2);
    }
}