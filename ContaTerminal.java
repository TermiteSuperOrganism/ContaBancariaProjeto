import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        //Confusao. Ele disse numero da  agencia
        //pro primeiro, mas agencia vem depois e eh 067-8
        int numero;
        String agencia; 
        String nomeCliente; 
        double saldo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Por favor, digite o numero de sua conta!");
        numero = ler.nextInt();
        System.out.println("Por facor, digite a agencia!");
        agencia = ler.nextLine();
        System.out.println("Por favor, digite seu nome!");
        nomeCliente = ler.nextLine();
        System.out.println("Digite seu saldo!");
        saldo = ler.nextDouble();

//        System.out.println("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia eh %s, conta %d e seu saldo %2f ja esta disponivel para saque.", nomeCliente, agencia, numero, saldo);
System.out.println("Ola, "+nomeCliente+"obrigado por criar uma conta em nosso banco, sua agencia eh "+agencia+", conta "+numero+" e seu saldo "+saldo+" ja esta disponivel para saque.");
    }
}
