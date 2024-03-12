import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. O usuário digita um número inteiro e o programa diz qual o dia da semana
        //correspondente, por exemplo: 1 – domingo, 2 – segunda-feira e assim por diante.

        int number;
        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite um número inteiro:");
        number = in.nextInt();

        switch (number) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }
    }
}
