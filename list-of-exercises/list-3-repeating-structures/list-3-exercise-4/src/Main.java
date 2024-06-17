
public class Main {
    public static void main(String[] args) {

        double f;

        for (double c = -80;c<=80;c+=10){
            f= 1.8*c+32;
            System.out.println(c+ "ºC = " + f + "ºF");
        }

    }
}