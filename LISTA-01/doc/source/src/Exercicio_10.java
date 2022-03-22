import java.util.Scanner;
import java.util.Random;

public class Exercicio_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        int sorteio = random.nextInt(100);
        int cont = 0;
        
        Boolean var=false;
                
        do {            
            System.out.print("Insira um valor: ");
            
            int value = scan.nextInt();
            
            if(value==sorteio){
                
                var = true;   
            }
            else{
                if(sorteio>value){
                    
                    System.out.println("O número sorteado é maior do que o digitado");
                }else{
                     System.out.println("O número sorteado é menor do que o digitado");
                }
            }
            cont++;

        } while (var==false);
       
        
        System.out.println("Parabens, você acertou depois de "+cont+" tentativas");
        scan.close();
    }
}