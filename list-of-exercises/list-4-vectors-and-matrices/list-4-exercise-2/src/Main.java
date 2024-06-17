public class Main {
    public static void main(String[] args) {
        int [] numbers = {0,1,2,3,4,5,6,7,8,9};
        String out = new String();

        for (int i=0;i<numbers.length;i++) {
            if (i % 2 == 0) {
                numbers[i]+=2;
            } else {
                numbers[i]*=2;
            }
            out+=numbers[i]+", ";
        }
        System.out.println(out);
    }
}