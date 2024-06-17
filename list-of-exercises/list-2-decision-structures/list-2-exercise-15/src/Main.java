import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valor, troco, expresso = 0.5, longo = 1, capuccino = 2.5, choc = 2;
        int menu;

        System.out.println("Insira o dinheiro:");
        valor = in.nextDouble();
        System.out.println("Menu:\n1.Café Expresso: R$ 0,50\n2.Café Longo: R$ 1,00\n3.Capuccino: R$ 2,50\n4.Chocolate: R$ 2,00\nEscolha uma forma de pagamento:");
        menu = in.nextInt();

        switch (menu) {
            case 1:
                System.out.println("\nBebida Selecionada: Café Expresso");
                troco = valor - expresso;
                System.out.println("\nSeu troco: R$ " +troco);
                break;
            case 2:
                System.out.println("\nBebida Selecionada: Café Longo");
                troco = valor - longo;
                System.out.println("\nSeu troco: R$ " +troco);
                break;
            case 3:
                System.out.println("\nBebida Selecionada: Capuccino");
                troco = valor - capuccino;
                System.out.println("\nSeu troco: R$ " +troco);
                break;
            case 4:
                System.out.println("\nBebida Selecionada: Chocolate");
                troco = valor - choc;
                System.out.println("\nSeu troco: R$ " +troco);
                break;
            default:
                System.out.println("\nOpção Inválida !!");
                break;
        }    }
}