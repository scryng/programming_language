import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 2. Criar um programa que receba 5 números inteiros digitados pelo usuário e ao final exiba  o maior e o menor números digitados (Obs.: Apenas o maior e o menor número devem  ser armazenados).

        // Variables
        int maior, menor, n;
        maior = 0;
        menor = 0;

        Scanner in = new Scanner(System.in);

        for(int i=0;i<5;i++){

            System.out.println("\nDigite n" + (i+1) + ":");

            n = in.nextInt();

            if(i==0){
                maior = n;
                menor = n;
            } else {
                if (n > maior){
                    maior = n;
                }
                if (n < menor){
                    menor = n;
                }
            }
        }

        System.out.println("\nMaior = " + maior);
        System.out.println("\nMenor = " + menor);

    }
}