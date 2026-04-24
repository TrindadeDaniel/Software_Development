import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta();
        System.out.println("Digite o nome: ");
        String n = sc.next();
        conta1.setNome(n);
        //conta1.setSaldo(1000);//saldo só deve ser editado com saque ou depósito
        conta1.setNumero( 2);//public //atributo private só pode ser acessado via método
        System.out.println("O nome digitado é: " + conta1.getNome());

        //conta 2
        Conta conta2 = new Conta();
        conta2.setNumero(5);
        
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
        sc.close();
    }






    
}
