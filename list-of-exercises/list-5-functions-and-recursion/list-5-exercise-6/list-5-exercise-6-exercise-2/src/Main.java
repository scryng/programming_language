import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(".5 É = "+ fat(receber()));
    }
    static int receber(){
        Scanner in = new Scanner(System.in);
        int n;
        do{
            System.out.println("Digite um numero maior que 0:");
            n=in.nextInt();
            System.out.print("Fatorial de "+n);
        }while(n<=0);
        return n;
    }
    static int fat(int n){
        if(n==1)
            return 1;
        return n * fat(n-1);
    }
}