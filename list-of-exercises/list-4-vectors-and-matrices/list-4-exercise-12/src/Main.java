import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] m1 = {
                {1, 2, 1},
                {3, 2, 2},
                {1, 1, 3}};

        int det1 = 1, det2 = 1, det3 = 1, detN =0;
        int detl1 = 1, detl2 = 1, detl3 = 1, detlN =0;

        int[][] m1_3x5 = new int[3][5];

        for (int i = 0; i < m1_3x5.length; i++) {
            for (int j = 0; j < m1_3x5[0].length; j++) {
                if (j == 3) {
                    m1_3x5[i][j] = m1[i][0];
                }
                else if (j == 4) {
                    m1_3x5[i][j] = m1[i][1];
                } else m1_3x5[i][j] = m1[i][j];
            }
        }

        for (int i = 0; i < m1_3x5.length; i++) {
            for (int j = 0; j < m1_3x5[0].length; j++) {
                if (i == j){
                    det1 = det1 * m1_3x5[i][j];
                }
                if(i == j-1){
                    det2 = det2 * m1_3x5[i][j];
                }
                if(i == j-2){
                    det3 = det3 * m1_3x5[i][j];
                }
            }
        }

        for (int i = 0; i < m1_3x5.length; i++) {
            for (int j = 0; j < m1_3x5[0].length; j++) {
                if (i+2 == j){
                    detl1 = detl1 * m1_3x5[i][m1_3x5[0].length-j-1];
                }
                if(i+1 == j){
                    detl2 = detl2 * m1_3x5[i][m1_3x5[0].length-j-1];
                }
                if(i == j){
                    detl3 = detl3 * m1_3x5[i][m1_3x5[0].length-j-1];
                }
            }
        }

        for (int[] ver : m1) {
            System.out.println(Arrays.toString(ver));
        }
        System.out.println();
        for (int[] see : m1_3x5) {
            System.out.println(Arrays.toString(see));
        }

        detN=det1+det2+det3;
        detlN=detl1+detl2+detl3;


        System.out.println("\nPrinipal =  "+det1+" + "+det2+" + "+det3+"  = "+detN);
        System.out.println("Secundaria =  "+detl1+" + "+detl2+" + "+detl3+"  = "+detlN);
        System.out.println("\nDeterminante = "+(detN-detlN));

    }
    static int determinante (int [][]m){
        int contPos, multiPos, somaPos=0;
        int contNeg, multiNeg, somaNeg=0;

        for (int i = 0; i<m.length;i++) {
            contPos = i;
            contNeg = i;
            multiPos = 1;
            multiNeg = 1;
            for (int j = 0; j < m[0].length; j++) {
                multiPos*=m[j][contPos];
                multiNeg*=m[j][contNeg];
                contPos++;
                contNeg--;
                if (contPos > m.length-1) {
                    contPos = 0;
                }
                if(contNeg<0){
                    contNeg=m.length-1;
                }
            }
            somaPos+=multiPos;
            somaNeg+=multiNeg;
        }
        return somaPos-somaNeg;
    }
    static int determinantes(int [][]m){
        int cont_pos,mult_pos,det=0;
        int cont_neg,mult_neg;
        for(int i=0;i<m.length;i++){
            cont_pos=i;
            cont_neg=i;
            mult_pos=1;
            mult_neg=1;
            for(int j=0;j<m[0].length;j++){
                mult_pos*=m[j][cont_pos];
                mult_neg*=m[j][cont_neg];
                cont_pos++;
                cont_neg--;
                if(cont_pos>m.length-1)
                    cont_pos=0;
                if(cont_neg<0)
                    cont_neg=m.length-1;
            }
            det+=mult_pos-mult_neg;
        }
        return det;
    }
}