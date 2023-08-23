import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta! ");
        int conta = scan.nextInt();

        scan.nextLine();

        System.out.println("Por favor, digite o número da Agência! ");
        String agencia = scan.nextLine();

        System.out.println("Por favor, digite o seu Nome! ");
        String nome = scan.nextLine();

        System.out.println("Por favor, digite o seu Saldo! ");
        double saldo = scan.nextDouble();
        
        System.out.println(
            "Olá " + nome + 
            ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
            ", conta " + conta + " e seu saldo " + saldo +  " já está disponível para saque."
        );
        
    }
}
