import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        Arquivo arq1 = new Arquivo("IA");
        Arquivo arq2 = new Arquivo("OOP");
        Arquivo arq3 = new Arquivo("Historia");

        int opcao;
        do {
            System.out.println("\n═══════════════════════════════");
            System.out.println("   Menu Arquivos Existentes:   ");
            System.out.println("═══════════════════════════════");
            System.out.println(" 1. "+arq1.getNome()+"         ");
            System.out.println(" 2. "+arq2.getNome()+"         ");
            System.out.println(" 3. "+arq3.getNome()+"         ");
            System.out.println(" 0. Fechar Aplicação           ");
            System.out.println("═══════════════════════════════");
            System.out.println("Digite qual arquivo será aberto:");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    arq1.abrirArq(arq1);
                    break;
                case 2:
                    arq2.abrirArq(arq2);
                    break;
                case 3:
                    arq3.abrirArq(arq3);
                    break;
                case 0:
                    System.out.println("Fechando ...");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("Opção Inválida");
                    break;
            }
        }while(opcao > 0);

    }
}