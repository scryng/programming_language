import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int[] other_numbers = new int[10];

        // for (int i = numbers.length - 1, j = 0; i >= 0 && j<=other_numbers.length-1; i--, j++) {
        //     other_numbers[j] = numbers[i];
        //     System.out.print(other_numbers[j] + " ");
        // }

        for (int i=0;i<numbers.length;i++){
            other_numbers[(numbers.length-1)-i] = numbers[i];
        }
        // System.out.print(Arrays.toString(other_numbers));
        String out = new String();
        for (int n : other_numbers){
            out+=n+" ";
        }
        System.out.println(out);
    }
}