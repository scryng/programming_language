import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 2. Elaborar uma minicalculadora, o programa recebe 2 números e exibe um menu para que o usuário escolha a operação e em seguida exibe o resultado.

        double number1, number2, result;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite um número:");
        number1 = in.nextDouble();

        System.out.println("\nDigite um número:");
        number2 = in.nextDouble();

        System.out.println("\nMenu:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");


        System.out.println("\nEscolha uma opção:");
        option = in.nextInt();

        System.out.println("Opção escolhida: " + option);

        switch (option) {
            case 1:
                result = number1 + number2;
                System.out.println("Resultado: " + number1 + " + " + number2 + " = " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Resultado: " + number1 + " - " + number2 + " = " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Resultado: " + number1 + " * " + number2 + " = " + result);
                break;
            case 4:
                result = number1 / number2;
                System.out.println("Resultado: " + number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
