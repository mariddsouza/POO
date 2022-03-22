import java.util.Scanner;

public class Exercicio_2 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.out.print("Insira o valor do numerador: ");
        float numerador = scan.nextFloat();
        
        System.out.print("Insira o valor do denominador: ");
        float denominador = scan.nextFloat();
        
        if(denominador==0){
           while(denominador==0){
               
                System.out.println("\n");
               
                System.out.println("O denominador deve ser diferente de diferente de zero!");
                
                System.out.print("Insira novamente o valor do denominador: ");
                
                denominador = scan.nextFloat();
           }
        }
        
        float resultado = numerador / denominador;
        System.out.println("Resultado: "+ resultado);
        
        scan.close();
    }
}