import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Soma = "+somar(receber()));
    }
    static int receber(){
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Digite um numero maior que 0:");
            n=in.nextInt();
        }while(n<=0);
        return n;
    }
    static int somar(int n){
        if(n==1)
            return 1;
        return n+somar(n-1);
    }
}