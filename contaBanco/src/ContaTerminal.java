import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mesagem conta criada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o seu nome completo: ");
        String nome = entrada.nextLine();

        System.out.println("Digite o número da agência: ");
        String agencia = entrada.next();

        int numero = 1021;
        double saldo = 237.58d;

        System.out.println("Olá " + nome + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia +", conta " + numero + " e seu saldo " + saldo + 
        " já está disponível para saque");
        
        entrada.close();

    }
}
