import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int j, k;
        System.out.println("Insira um número a ser calculado:");
        k = in.nextInt();
        System.out.println("Sua tabuada é:\n");

        for (int i = 0; i <= 10; i++) {

            j = i * k;

            System.out.println(i + " x " + k + " = " + j);
        }

    }
}