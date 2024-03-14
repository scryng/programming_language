import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int [] numbers = new int [4];
        Scanner in = new Scanner(System.in);
        System.out.println("Digite 4 números separados por espaço");
        for (int i=numbers.length-1;i>=0;i--) {
            numbers[i] = in.nextInt();
        }

        String out = new String();
        for (int n : numbers){
            out+=n+" ";
        }
        System.out.println(out);
    }
}