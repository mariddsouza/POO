import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira o ano do seu Nascimento: ");
        var AnoNascimento = scan.nextInt();
        
        System.out.print("Insira o ano atual: ");
        var AnoAtual = scan.nextInt();
        
        var idade = AnoAtual - AnoNascimento;
        
        System.out.println("Você faz " + idade + " anos neste ano.");

        scan.close();
    }
}