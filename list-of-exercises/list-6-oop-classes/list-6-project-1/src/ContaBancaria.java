import java.util.Scanner;

public class ContaBancaria {
    private int numConta;
    private double saldo;
    private String titular;

    Scanner in = new Scanner(System.in);

    public ContaBancaria(int numeroConta, String nomeTitular) {
        this.numConta = numeroConta;
        this.saldo = 0;
        this.titular = nomeTitular;
    }

    public boolean deposito() {
        System.out.println("Digite o valor a ser Depositado:");
        double deposito = in.nextDouble();
        if (deposito <= 0)
            return false;
        else {
            this.saldo += deposito;
            return true;
        }
    }

    public boolean saque() {

        System.out.println("Digite o valor a ser Sacado:");
        double saque = in.nextDouble();

        if (saque <= 0 && saque > this.saldo) {
            return false;
        }
        this.saldo -= saque;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numConta= " + numConta +
                ", saldo= R$" + saldo +
                ", titular= " + titular +
                '}';
    }
}