public class Main {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,7,8,9};
        int aux;
        for (int i = numbers.length - 1, j = 0; i >= 5 && j<=4; i--, j++) {
            aux = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = aux;
        }
        String out = new String();
        for (int n : numbers){
            out+=n+" ";
        }
        System.out.println(out);
    }
}