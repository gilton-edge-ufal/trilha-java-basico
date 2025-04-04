import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String cliente;
        String agencia;
        long conta;
        BigDecimal saldo;

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Favor informar o seu nome.");
            cliente = scan.nextLine();
            System.out.println("\nFavor informe seus dados Bancários a seguir:");
            System.out.println("Agencia");
            agencia = scan.nextLine();
            System.out.println("Conta");
            conta = Long.parseLong( scan.nextLine() );
            System.out.println("Favor informa o seu Saldo.");
            saldo = new BigDecimal(scan.nextLine() );
        }

        System.out.println();
        System.out.println("************\tConta Criada\t************");
        System.out.println("Cliente:  "  + cliente);
        System.out.println("Agência:  "  + agencia);
        System.out.println("Conta:    "  +   conta);
        System.out.println("Saldo: R$ " +   new DecimalFormat("#.00").format(saldo) + " reais");
        System.out.println("*******************************************");
        System.out.println();
    }
}
