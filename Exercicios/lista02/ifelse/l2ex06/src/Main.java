import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n. Em um sistemas de caixa eletrônico o usuário deve escolher entre as opções de um\n" +
                "menu escolhendo um número inteiro entre 5 e 9 inclusive. Crie um algoritmo que valide\n" +
                "a entrada do usuário exibindo a opções escolhida ou a mensagem de opção inválida caso\n" +
                "o usuário entre com um número fora do range estabelecido.");

        int op;

        Scanner in = new Scanner(System.in);

        // System.out.println("");
        System.out.println("\n5. Opção 5\n6. Opção 6\n7. Opção 7\n8. Opção 8\n9. Opção 9\nEscolha uma opção:");

        op = in.nextInt();

        if (op > 4 && op < 10) {
            System.out.println("OK");
        } else {
            System.out.println("Opção inválida");
        }

    }
}