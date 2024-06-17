public class Main {
    public static void main(String[] args) {

        int[][] matriz =
                        {{1, 2, 3, 4, 5},
                        {2, 3, 4, 6, 1},
                        {3, 4, 7, 1, 2},
                        {4, 8, 1, 2, 3},
                        {9, 10, 10, 3, 4}};

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }
}