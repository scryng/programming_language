import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 10. Escreva um programa que gere a sequência de Fibonacci até o enésimo termo, onde n é um número fornecido pelo usuário. Na matemática, a sucessão de Fibonacci, é uma sequência de números inteiros, começando normalmente por 0 e 1, na qual cada termo subsequente corresponde à soma dos dois anteriores. • Exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 897, 1597...
        int n,n1,n2,aux,cont;
        n1=0;
        n2=1;
        cont=1;
        System.out.println("Digite o limite esperado para a sequencia de Fibonacci: ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(0);

        while (cont<n){
            System.out.println(n2);
            aux=n1;
            n1=n2;
            n2=aux+n2;
            cont++;
        }

        // int n,n1,n2,aux,cont;
        // n1=0;
        // n2=1;
        // cont=1;
        // System.out.println("Digite o limite esperado para a sequencia de Fibonacci: ");
        // Scanner in = new Scanner(System.in);
        // n = in.nextInt();
        // System.out.println(0);

        // while (cont<n){
        //     System.out.println(n2);
        //     aux=n1;
        //     n1=n2;
        //     n2=aux+n2;
        //     cont++;
        // }
    }
}