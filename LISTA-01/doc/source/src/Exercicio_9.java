import java.util.Scanner;

public class Exercicio_9 {
    
    public static int soma(int num1, int num2) {
        return num1 + num2;
    }  
    public static int sub(int num1, int num2){
        return num1 - num2;
    }  
    public static int div(int num1,int num2){
        return num1 / num2;
    }  
    public static int mult(int num1, int num2){
        return num1 * num2;
    }  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira a operação desejada : ");
        String op = scan.nextLine();

        op = op.toLowerCase();
        
        String[] currencies = op.split(" ");
        
        int resultado = 0;
        int fs = Integer.parseInt(currencies[1]);
        int sec = Integer.parseInt(currencies[3]);
        
        
        
        switch (currencies[0]){
            case "SOMA":
                resultado = soma(fs,sec);
                break;
            case "MULTIPLICA":
                resultado = mult(fs,sec);
                break;
            case "DIVIDE":
                resultado = div(fs,sec);
                break;
            case "SUBTRAI":
                System.out.print("--------RESULTADO-------");
                resultado = sub(fs,sec);
                break;
        }
        
        System.out.println("RESULTADO: "+ resultado);
        scan.close();
    }
}