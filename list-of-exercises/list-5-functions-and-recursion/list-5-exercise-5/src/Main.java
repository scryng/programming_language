import java.math.MathContext;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 80, 88};

        System.out.println("Digite o valor a ser Buscado:");
        int valor = in.nextInt();

        if(binaria(array,valor) == -1)
            System.out.println("Valor não Encontrado!!");
        else
            System.out.println("O index do número "+valor+". Posição = "+binaria(array, valor)+".");

    }
    static int binaria(int array[], int x){
        int menor = 0;
        int maior = array.length-1;
        int metade;

        while(menor <= maior) {

            metade=(menor + maior) / 2;
            if(array[metade] < x)
                menor = metade + 1;
            else if(array[metade] > x)
                maior = metade - 1;
            else
                return metade;
        }
        return -1;
    }
}