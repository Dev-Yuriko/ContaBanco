import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome =sc.next();

        System.out.print("Por favor, digite o número da Agência !: ");
        String agencia =sc.next();

        System.out.print("Por favor, digite o número da conta !: ");
        int numeroConta =sc.nextInt();

        System.out.print("Por favor, digite o seu saldo !: ");
        float saldo =sc.nextFloat();



        System.out.println("Olá"+ nome + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + "," 
        + "conta" + numeroConta + "e seu saldo " + saldo + " já está disponível para saque");

        
        sc.close();
    }
}