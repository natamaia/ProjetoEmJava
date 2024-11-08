import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner usuario = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("digite seu nome: ");
        String Name = usuario.next();
        
        System.out.print("digite o numero da sua agencia: ");
        String Agencia = usuario.next();
        
        System.out.print("digite o número da sua conta: ");
        int Conta = usuario.nextInt();
        
        double Saldo = 237.48;
        
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Olá " + (Name) + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("    Agência: " + (Agencia) + "\n    Numero da conta: " + (Conta) + "\n    Saldo: " + (Saldo));
        System.out.println("Seu saldo já está disponível para saque.");
        System.out.println("------------------------------------------------------------------------");
    }
}
