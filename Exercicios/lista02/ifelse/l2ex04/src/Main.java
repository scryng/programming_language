import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nEntrar com a nota 1 (n1) e nota 2 (n2) e o programa exibe na tela a média. Se a média for maior ou igual a 50, exibir “Aprovado”, caso contrário solicitar ao usuário a nota da prova de recuperação, tirar nova média entre a média anterior e a prova de recuperação,se a nova média for menor que 50 exibir “Reprovado” caso contrário exibir “Aprovado”.");

        int number1, number2, number3;
        float media;
        float media2;

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite a nota 1 (n1)");
        number1 = in.nextInt();

        System.out.println("\nDigite a nota 2 (n2)");
        number2 = in.nextInt();

        // Calculando a média
        media = (float)(number1 + number2) / 2;

        if (media < 10) {

            media = media * 10;

            if (media >= 50) {
                System.out.println("Aprovado com média: " + media);
            } else {
                // System.out.println("Reprovado, média: " + media);

                System.out.println("\nDigite a nota da prova de recuperação");
                number3 = in.nextInt();

                media2 = (float)(number1+number2+number3) / 3;

                if (media2 < 10) {

                    media2 = media2 * 10;

                    if (media2 >= 50) {
                        System.out.println("Aprovado com média: " + media2);
                    } else {
                        System.out.println("Reprovado, média: " + media2);
                    }

                } else {

                    if (media2 >= 50) {
                        System.out.println("Aprovado com média: " + media2);
                    } else {
                        System.out.println("Reprovado, média: " + media2);
                    }
                }
            }

        }
        else {
            if (media >= 50) {
                System.out.println("Aprovado com média: " + media);
            } else {
                // System.out.println("Reprovado, média: " + media);

                System.out.println("\nDigite a nota da prova de recuperação");
                number3 = in.nextInt();

                media2 = (float)(number1+number2+number3) / 3;

                if (media2 < 10) {

                    media2 = media2 * 10;

                    if (media2 >= 50) {
                        System.out.println("Aprovado com média: " + media2);
                    } else {
                        System.out.println("Reprovado, média: " + media2);
                    }

                } else {

                    if (media2 >= 50) {
                        System.out.println("Aprovado com média: " + media2);
                    } else {
                        System.out.println("Reprovado, média: " + media2);
                    }
                }
            }
        }
    }
}