import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero para decobrir seu Fatorial");
        int j= in.nextInt();
        System.out.println("Fatorial de " + j + " = " + fatorial(j)+ ".");
    }
    static int fatorial (int fatorial){
        for (int i = fatorial; i > 1; i--) {
            fatorial *= (i - 1);
        }
        return fatorial;
    }
}