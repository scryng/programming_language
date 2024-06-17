import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit.

        System.out.println("\nExercício 11: Entrar com o valor de temperatura em graus Celsius e exibir a temperatura correspondente em graus Fahrenheit.");

        double celsius, fahrenheit;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor de temperatura em ºC:");

        celsius = in.nextDouble();

        fahrenheit = (celsius * 9 / 5 + 32);

        System.out.println("A mesma medida em ºF é:\n" + fahrenheit);

    }
}