import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um numero maior que 0:");
        somaN(in.nextInt());
    }
    static void somaN(int numero){
        int soma = numero;
        for (int i = 1; i<numero;i++){
            soma=soma+i;
        }
        System.out.println(soma);
    }
}