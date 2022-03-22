package Exercicio1;
/**
 *
 * @author MARIANA
 */
import Exercicio1.CalCientifica;

//Arquivo para testar a calculadora
public class testeCal {
    public static void main(String[] args) {
        CalCientifica cc = new CalCientifica();
        
        System.out.println("----SOMA----- ");
        System.out.println(cc.sum(45, 30));
        
        System.out.println("----SUBTRACAO----- ");
        System.out.println(cc.sub(96, 56));
        
        System.out.println("----MULTIPLICACAO----- ");
        System.out.println(cc.mult(80, 41));
        
        System.out.println("----DIVISAO----- ");
        System.out.println(cc.div(9, 4));
        
        System.out.println("----RAIZ QUADRADA----- ");
        System.out.println(cc.sqrt(4));
        
        System.out.println("----POTENCIA----- ");
        System.out.println(cc.pow(3, 9));  
    }
}
