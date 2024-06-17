import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String received = in.nextLine();

        palindromo(received.replaceAll(" ", ""));
    }
    static void palindromo (String str){
        boolean stop = false;
        for (int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                System.out.println("Não é um Palindromo!!");
                stop = true;
                break;
            }
        }
        if(!stop)
            System.out.println("É um Palindromo!!");
    }
}