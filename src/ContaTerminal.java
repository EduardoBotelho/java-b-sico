import java.math.BigInteger;
import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO:CONHECER E IMPORTAR CLASSE SCANNER
        Scanner leitor = new Scanner(System.in);
        // EXIBIR MENSAGEM PARA O USUARIO
        System.out.println("Por favor digite o numero da conta!");
        // OBTER PELA SCANNER OS VALORES DIGITADOS NO TERMINAL
        BigInteger numero = leitor.nextBigInteger();

        System.out.println("Por favor digite a agencia:");
        int agencia = leitor.nextInt();
        leitor.nextLine();

        System.out.println("Por favor entre com o nome do cliente:");
        String nome = leitor.nextLine();

        System.out.println("Entre com o saldo :");
        double saldo = leitor.nextDouble();

        // EXIBIR A MENSAGEM CONTA CRIADA
        System.out.println("Ola :" + nome + ",obrigado por criar uma conta em nosso banco,sua agencia" + agencia
                + ",conta:" + numero + " e seu saldo:=" + saldo + " ja esta disponivel para saque");

    }
}