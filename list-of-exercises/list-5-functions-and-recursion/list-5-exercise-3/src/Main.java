import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o numero base da potenciação:");
        num1 = in.nextInt();
        System.out.println("Digite o numero expoente de uma potenciação:");
        num2 = in.nextInt();
        System.out.println("A potencia de "+num1+"^"+num2+" = " + potencia(num1, num2));
    }
    static int potencia(int base, int expo) {
        boolean segue = false;
        if (base == 0 && !segue) {
            segue = true;
        }else if(!segue)  {
            int multi = base;
            for (int i = 1;  i < expo; i++) {
                base = base * multi;
            }
        }
        if (expo == 0){
            return 1;
        }
        return base;
    }
}