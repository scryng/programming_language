import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("\nReceba um número real e caso ele seja positivo imprima sua raiz quadrada, caso contrário imprima a mensagem: “Valor inválido!”");

        double number;

        Scanner in = new Scanner(System.in);

        // System.out.println("");
        System.out.println("\nDigite um número real");

        number = in.nextDouble();

        if (number >= 0) {
            double squareRoot = Math.sqrt(number);
            System.out.println("A raiz quadrada de " + number + " é:\n" + squareRoot);
        } else
            System.out.println("Valor inválido!");
    }
}