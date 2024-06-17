import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Receber velocidade velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade.

        System.out.println("\nExercício 17: Receber velocidade velocidade inicial, aceleração e tempo de percurso de um corpo e calcular sua velocidade. ");

        double vi, acel, time, result;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite o valor da velocidade inicial:");

        vi = in.nextDouble();

        System.out.println("Digite o valor da aceleração:");

        acel = in.nextDouble();

        System.out.println("Digite o valor do tempo de percurso:");

        time = in.nextDouble();

        result = (vi + acel * time);

        System.out.println("O velocidade final é:\n" + result + "m/s");

    }
}