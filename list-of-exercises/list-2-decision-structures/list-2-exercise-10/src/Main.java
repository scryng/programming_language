import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, n3, menor, meio, maior;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 3 números inteiros: ");
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();

        if (n1 > n2 && n1 > n3) {
            maior = n1;
        } else if (n2 > n3) {
            maior = n2;
        } else {
            maior = n3;
        }

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        meio = (n1 + n2 + n3) - (maior + menor);

        System.out.println("Os números em ordem crescente são: " + menor + ", " + meio + ", " + maior);
    }
}