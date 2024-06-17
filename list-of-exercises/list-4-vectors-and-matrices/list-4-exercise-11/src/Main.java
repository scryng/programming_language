import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Determinando tamanho das Matrizes
        System.out.println("Digite o numero de linhas e colunas da primeira Matriz: [valorLinha] [valorColuna]");
        int[][] m1 = new int[in.nextInt()][in.nextInt()];

        System.out.println("Digite o numero de colunas da segunda Matriz: [Coluna]");
        int[][] m2 = new int[m1[0].length][in.nextInt()];

        int[][] pro = new int[m1.length][m2[0].length];

        // Inserir valores m1
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                System.out.println("Digite os valores da Matriz 1!! Linha" + i + " Coluna" + j);
                m1[i][j] = in.nextInt();
            }
        }

        // Inserir valores m2
        for (int i = 0; i < m2.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                System.out.println("Digite os valores da Matriz 2!! Linha: " + i + " Coluna: " + j);
                m2[i][j] = in.nextInt();
            }
        }
        for (int z = 0; z < m2[0].length; z++) {
            for (int i = 0; i < m1[0].length; i++) {
                for (int j = 0; j < m1.length; j++) {
                    pro[j][z] = pro[j][z] + (m1[j][i] * m2[i][z]);
                }
            }
        }
        System.out.println();
        System.out.println("Matriz 1:");
        for (int[] ver : m1) {
            System.out.println(Arrays.toString(ver));
        }
        System.out.println();
        System.out.println("Matriz 2:");
        for (int[] see : m2) {
            System.out.println(Arrays.toString(see));
        }
        System.out.println();
        System.out.println("Matriz Produto:");
        for (int[] look : pro) {
            System.out.println(Arrays.toString(look));
        }
    }
}