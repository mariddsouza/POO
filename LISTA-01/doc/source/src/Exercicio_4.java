import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira um nome de mês: ");
        String mes = scan.next();
        
        switch (mes) {
            case "Janeiro":
              System.out.println("Janeiro = " + 1);
              break;
            case "Fevereiro":
              System.out.println("Fevereiro = " + 2);
              break;
            case "Março":
              System.out.println("Março = " + 3);
              break;
            case "Abril":
              System.out.println("Abril = " + 4);
              break;
            case "Maio":
              System.out.println("Maio = " + 5);
              break;
            case "Junho":
              System.out.println("Junho = " + 6);
              break;
            case "Julho":
              System.out.println("Julho = " + 7);
              break;
            case "Agosto":
              System.out.println("Agosto = " + 8);
              break;
            case "Setembro":
              System.out.println("Setembro = " + 9);
              break;
            case "Outubro":
              System.out.println("Outubro = " + 10);
              break;
            case "Novembro":
              System.out.println("Novembro = " + 11);
              break;
            case "Dezembro":
              System.out.println("Dezembro = " + 12);
              break;
        default:
          System.out.print(0);
        }

        scan.close();
    }
}