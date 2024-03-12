import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a data de nascimento (dd/mm/aaaa): ");
        String dataNascimento = scanner.nextLine();

        System.out.println("Insira a data de expedição (dd/mm/aaaa): ");
        String dataExpedicao = scanner.nextLine();

        if (validarFormatoData(dataNascimento) && validarFormatoData(dataExpedicao)) {
            int[] somaNascimento = calcularSomaAlgarismos(dataNascimento);
            int[] somaExpedicao = calcularSomaAlgarismos(dataExpedicao);

            int somaNascimentoTotal = somaNascimento[0] + somaNascimento[1] + somaNascimento[2];
            int somaExpedicaoTotal = somaExpedicao[0] + somaExpedicao[1] + somaExpedicao[2];

            int diferencaAbsoluta = Math.abs(somaNascimentoTotal - somaExpedicaoTotal);

            if (ehPrimo(diferencaAbsoluta)) {
                System.out.println("Documento autêntico.");
            } else {
                System.out.println("Possibilidade de falsificação.");
            }
        } else {
            System.out.println("Formato de data inválido.");
        }

        scanner.close();
    }

    // Verifica se a data está no formato correto (dd/mm/aaaa)
    public static boolean validarFormatoData(String data) {
        return data.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    // Calcula a soma dos algarismos da data e retorna um array com as somas do dia, mês e ano
    public static int[] calcularSomaAlgarismos(String data) {
        String[] partes = data.split("/");
        int[] soma = new int[3];

        for (int i = 0; i < partes.length; i++) {
            for (char c : partes[i].toCharArray()) {
                soma[i] += Character.getNumericValue(c);
            }
        }

        return soma;
    }

    // Verifica se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
