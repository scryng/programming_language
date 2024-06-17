
public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(1, "Antonio Bandeiras");
        System.out.println("\nSaldo em conta: R$ " + conta1.getSaldo());

        if (conta1.deposito()){
            System.out.println("Depósito realizado com sucesso!!");
            System.out.println("\nSaldo em conta: R$ " + conta1.getSaldo());
        }else System.out.println("Depósito não realizado. Insira um valor de depósito maior que 0 !!");

        if(conta1.saque()) {
            System.out.println("Saque realizado com sucesso!");
            System.out.println("\nValor saldo: R$"+conta1.getSaldo());
        }else System.out.println("Saque não realizado. Insira um valor de saque possível!");

        System.out.println("\n"+conta1);
    }
}