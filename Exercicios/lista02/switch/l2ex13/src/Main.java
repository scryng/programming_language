import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 3. Calculadora geométrica: exibir em um menu a opção de escolha entre três forma geométricas: círculo, triangulo retângulo ou retângulo. Após a seleção da opção o programa deverá solicitar que o usuário insira os dados necessário para realizar os cálculos de área e perímetro da forma selecionada, os resultados devem ser exibidos em seguida.

        double base, altura, raio, area, perimetro;
        int option;

        Scanner in = new Scanner(System.in);

        System.out.println("\nMenu:");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");

        System.out.println("\nEscolha uma opção:");
        option = in.nextInt();

        switch (option) {
            case 1:
                System.out.println("Informe o raio do círculo:");
                raio = in.nextDouble();
                area = Math.PI * raio * raio;
                perimetro = 2 * Math.PI * raio;
                System.out.println("Área: " + area);
                System.out.println("Perímetro: " + perimetro);
                break;
            case 2:
                System.out.println("Informe a base do triângulo retângulo:");
                base = in.nextDouble();
                System.out.println("Informe a altura do triângulo retângulo:");
                altura = in.nextDouble();
                area = (base * altura) / 2;
                perimetro = base + altura + Math.sqrt(base * base + altura * altura);
                System.out.println("Área: " + area);
                System.out.println("Perímetro: " + perimetro);
                break;
            case 3:
                System.out.println("Informe a base do retângulo:");
                base = in.nextDouble();
                System.out.println("Informe a altura do retângulo:");
                altura = in.nextDouble();
                area = base * altura;
                perimetro = 2 * (base + altura);
                System.out.println("Área: " + area);
                System.out.println("Perímetro: " + perimetro);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }
    }
}
