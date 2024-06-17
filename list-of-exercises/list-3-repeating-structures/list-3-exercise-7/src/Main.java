import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int j;

        for (int k = 1; k <= 10; k++) {
            System.out.println("");
            for (int i = 0; i <= 10; i++) {

                j = i * k;

                System.out.println(i + " x " + k + " = " + j);
            }
        }
    }
}