public class Main {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,16};

        String out = new String();
        for (int i=numbers.length-1;i>=0;i--) {
            out+=numbers[i]+" ";
        }
        System.out.println(out);
    }
}