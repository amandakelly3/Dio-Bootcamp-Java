import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Olá, digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("digite o número da sua agência: ");
        int agencia = entrada.nextInt();

        System.out.println("digite o número da sua conta: ");
        int numero = entrada.nextInt();

        System.out.println("digite o saldo da sua conta: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá, " + nome + "obrigado por criar uma conta em nosso banco, Sua agência é " + agencia + ", sua conta é " + numero + " e seu saldo é " + saldo + "já está disponível para saque.");
        entrada.close();

}
}

