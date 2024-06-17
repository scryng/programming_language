import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String received = in.nextLine();
        int i = -1, j = received.length()-1-i;

        System.out.println(palindromo(received.replaceAll(" ", ""), i, j));
    }
    static String palindromo(String str, int i, int j){
        if (i == str.length()/2)
            return "É um palindromo!!";
        i++;
        if(str.charAt(i) != str.charAt(str.length()-1-i)){
            return "Não é um palindromo!!";
        }
        return palindromo(str,i,j);
    }
}