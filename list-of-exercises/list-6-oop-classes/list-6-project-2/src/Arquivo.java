import java.util.Objects;
import java.util.Scanner;

public class Arquivo {
    private String nome;
    private int tamanho;
    private String conteudo;

    Scanner in = new Scanner(System.in);

    public Arquivo(String nomeA) {
        this.nome = nomeA;
    }

    public void abrirArq(Arquivo arquivo) throws InterruptedException {
        System.out.println(arquivo);
        int opcao;
        do {
            System.out.println("\n╔═══════════════════════════════════╗");
            System.out.println("║       Menu Arquivo                ║");
            System.out.println("╠═══════════════════════════════════╣");
            System.out.println("║ 1. Editar Arquivo                 ║");
            System.out.println("║ 2. Renomear Arquivo               ║");
            System.out.println("║ 3. Limpar Arquivo                 ║");
            System.out.println("║ 0. Sair do Menu do arquivo        ║");
            System.out.println("╚═══════════════════════════════════╝");
            System.out.println("Digite a opção desejada:");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    editarArq(arquivo);
                    break;
                case 2:
                    renomearArq(arquivo);
                    break;
                case 3:
                    limparArq(arquivo);
                    break;
                case 0:
                    System.out.println("Saindo ...");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("Opção Invalida!!");
                    break;
            }

        } while (opcao > 3);


    }

    public void tamanhoArq(Arquivo arquivo) {
        arquivo.tamanho = arquivo.conteudo.length() * 8; // qtd char * 8 bits por char.
    }

    public void editarArq(Arquivo arquivo) {
        if (arquivo.getConteudo() == null){
            arquivo.setConteudo("");
        }

        System.out.println("\nDigite o conteudo a ser adicionado:");
        in.nextLine();
        arquivo.setConteudo((arquivo.getConteudo() +"\n"+ in.nextLine()).trim());
        tamanhoArq(arquivo);
        System.out.println("Arquivo após alterações:");
        System.out.println(arquivo);
    }

    public void renomearArq(Arquivo arquivo){
        System.out.println("Nome do Arquivo: " +arquivo.nome);
        System.out.println("Digite o novo nome do Arquivo:");
        in.nextLine();
        arquivo.setNome(in.nextLine());
        System.out.println(arquivo);
    }

    public void limparArq(Arquivo arquivo){
        System.out.println("Voce tem certeza que deseja apagar as informações do arquivo "+ arquivo.nome);
        System.out.println("Sim (Y), Não (N)");
        String opcao = in.next();

        if (Objects.equals(opcao, "Y") || Objects.equals(opcao, "y")){
            arquivo.setNome("");
            arquivo.setTamanho(0);
            arquivo.setConteudo("");
            System.out.println(arquivo);
        } else if (Objects.equals(opcao, "N") || Objects.equals(opcao, "n")) {
            System.out.println(arquivo);
            return;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public String toString() {
        return "\nArquivo{" +
                "nome= " + nome + '\'' +
                ", tamanho= " + tamanho +" bits"+
                ", conteudo= " + conteudo + '\'' +
                '}';
    }
}