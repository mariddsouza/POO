import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio_8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String value = "";
            
        List<Integer> numbers = new ArrayList<>();

        do {            
            System.out.print("Insira um valor: ");
            value = scan.next();
            
            if(value.equals("fim")){
                break;
            }
            else{
                numbers.add(Integer.parseInt(value));
            }
            
        } while ((!value.equals("fim")));
        
        int[] num;
        
        num = new int[numbers.size()];
        
        for (int i = 0; i < numbers.size(); i++) {
            num[i] =   numbers.get(i);
        }
     
        for (int i = 0; i < num.length; i++) {  
            for (int j = i + 1; j < num.length; j++) {  
                int tmp = 0;

                if (num[i] > num[j])   {  
                    tmp = num[i];  
                    num[i] = num[j];  
                    num[j] = tmp;  
                }
            }
        }  
        
        System.out.println("Números ordenados: "+ Arrays.toString(num));
        scan.close();
    }
}