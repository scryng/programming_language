import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber o raio e a altura de um cone e calcular seu volume.

        System.out.println("\nExercício 16: Receber o raio e a altura de um cone e calcular seu volume.");

        double raio, altura, result;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o valor da raio:");

        raio = in.nextDouble();

        System.out.println("Digite o valor da altura:");

        altura = in.nextDouble();

        double pi = 3.141592653;

        result = ((1.0 / 3) * pi * (raio * raio) * altura);

        System.out.println("O volume é:\n" + result + "cm³");

    }
}