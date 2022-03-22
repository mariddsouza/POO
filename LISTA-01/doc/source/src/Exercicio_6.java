import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("primeiro horario");
        
        System.out.print("Digite o primeiro valor das horas: ");
        int horas = scan.nextInt();
        
        System.out.print("Digite o primeiro valor dos minutos: ");
        int minutos = scan.nextInt();
        
        System.out.print("Digite o primeiro valor dos segundos: ");
        int seg = scan.nextInt();
        
        
        System.out.println("Segundo horario");
        
        System.out.print("Digite o segundo valor das horas: ");
        int horasdois = scan.nextInt();
        
        System.out.print("Digite o segundo valor dos minutos: ");
        int minutosdois = scan.nextInt();
        
        System.out.print("Digite o segundo valor dos segundos: ");
        int segdois = scan.nextInt();

        System.out.println("Saida");
        
        int result = ((horas-horasdois)*3600)+((minutos-minutosdois)*60)+(seg-segdois);
        
        System.out.println(result+" segundos");

        scan.close();
    }
}