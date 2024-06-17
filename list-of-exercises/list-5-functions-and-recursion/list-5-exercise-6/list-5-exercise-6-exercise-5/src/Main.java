import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = {13, 15, 24, 30, 33, 40, 42, 52, 69, 71, 80, 88};
        int menor = 0;
        int maior = array.length-1;
        int metade = 0;
        System.out.println("Digite o valor a ser Buscado:");
        int valor = in.nextInt();
        if (binaria(array, valor,menor, maior, metade) == -1)
            System.out.println("Valor não Encontrado!!");
        else
            System.out.println("O index do número " + valor + ". Posição = " + binaria(array, valor, menor, maior, metade) + ".");
    }
    static int binaria (int[] list, int n, int menor, int maior, int metade){
        if(menor > maior)
            return -1;
        metade = (menor+maior)/2;
        if(list[metade] < n)
            menor =  metade+1;
        else if (list[metade] > n)
            maior = metade-1;
        else
            return metade;

        return binaria(list , n, menor, maior, metade);
    }
}