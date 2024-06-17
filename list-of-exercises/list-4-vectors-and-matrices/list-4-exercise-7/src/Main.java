public class Main {
    public static void main(String[] args) {
        int [] [] matriz = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        for (int [] line : matriz){
            for (int column : line){
                System.out.print(column+", ");
            }
            System.out.println(" ");
        }

        int column_sum, line_sum, biggest_column_sum, biggest_line_sum;
        biggest_line_sum = Integer.MIN_VALUE;
        biggest_column_sum = Integer.MIN_VALUE;

        for (int i=0; i<matriz.length; i++){
            column_sum = 0;
            line_sum = 0;
            for (int j=0; j<matriz[0].length; j++) {
                line_sum+=matriz[i][j];
                column_sum+=matriz[j][i];
            }
            if (i == 0) {
                biggest_column_sum=column_sum;
                biggest_line_sum=line_sum;
            } else {
                if (column_sum>biggest_column_sum)
                    biggest_column_sum=column_sum;
                if (line_sum>biggest_line_sum)
                    biggest_line_sum = line_sum;
            }
        }
        System.out.println("\nMaior soma das linhas = " + biggest_line_sum);
        System.out.println("\nMaior soma das colunas = " + biggest_column_sum);
    }
}