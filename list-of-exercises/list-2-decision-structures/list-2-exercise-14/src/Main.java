import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 4. Crie um sistema de vendas onde o usuário insere o valor da compra e escolhe a forma de pagamento que pode ser: débito, crédito ou pix. Após escolher a forma de pagamento o sistema deve mostrar o total a pagar que deve seguir as seguintes regras:
        // • Débito: Conceder desconto de 5%.
        // • Pix: Conceder desconto de 10%.
        // • Crédito: taxa de 2% do valor total em parcelamento até 4 vezes ou taxa de 5% do valor total em parcelamentos superior a 4 vezes.

        // double base, altura, raio, area, perimetro;
        double value;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("\nInsira o valor da compra:");
        value = in.nextDouble();

        System.out.println("\nMenu:");
        System.out.println("1. Débito");
        System.out.println("2. Pix");
        System.out.println("3. Crédito");

        System.out.println("\nEscolha a forma de pagamento:");
        option = in.nextInt();

        if (option == 1) {
            System.out.println("\nDébito Selecionado");
        } else if (option == 2) {
            System.out.println("\nPix Selecionado");
        } else if (option == 3) {
            System.out.println("\nCrédito Selecionado");
        } else {

        }

        System.out.println("\n" + );


        switch (option) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
