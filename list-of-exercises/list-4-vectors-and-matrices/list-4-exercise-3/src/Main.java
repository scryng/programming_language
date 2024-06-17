import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int n;
        boolean verification = false;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        n = in.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                System.out.println("O número digitado é existente no vetor, posição do número no vetor:" + i);
                verification = true;
                break;
            }
        }
        if (!verification) {
            System.out.println("Valor não encontrado.");
        }
    }
}