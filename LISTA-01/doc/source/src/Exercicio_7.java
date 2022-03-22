import java.util.Scanner;

public class Exercicio_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira o valor de N: ");
        
        int n = scan.nextInt();
        int total = 0; int impar = 0; int par = 0; int maior = 0; int menor = 0;
        
        if(n>1000||n<0){
            while(n>1000||n<0){
                System.out.print("Digite o valor de N: ");
                n = scan.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++){
            System.out.print("Digite um valor: ");
            
            int value = scan.nextInt();
            total+=value;
            
            if(i==0){
                maior = value;
                menor = value;
            }
            
            if(n>maior){
                maior = value;
            }
            
            if(menor<n){
                maior = value;
            }
            
            if(value%2==1){
                
                impar++;
            }else{
               
                par++;
            }
        }
        
         System.out.println("-------------RESULTADOS-----------");
        System.out.println("Menor valor: " + menor);
        System.out.println("Media aritmética: " + (total/n));
        System.out.println("Maior valor : " + maior);
        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);
        
        scan.close();
    }
}