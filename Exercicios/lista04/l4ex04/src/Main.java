import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] numbers = new int [10];

        int maior = 0;
        int menor = 0;
        int posicao_maior = 0;
        int posicao_menor = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite 10 números separados por espaço");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maior) {
                maior = numbers[i];
                posicao_maior = i;
            } else if (numbers[i] < menor) {
                menor = numbers[i];
                posicao_menor = i;
            }
        }
        System.out.println("O maior número do vetor é: " + maior + " na posição " + posicao_maior);
        System.out.println("O maior número do vetor é: " + menor + " na posição " + posicao_menor);
    }
}