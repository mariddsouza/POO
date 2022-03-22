//arquivo de teste
package Exercicio4;
/**
 *
 * @author MARIANA
 */
import Exercicio4.Produto;
public class TestaProduto {
    public static void main(String[] args) {
        Produto[] prod = new Produto[35];
        for (int i=0; i<35; i++){
            prod[i] = new Produto(i);
            
            prod[i].setVol(i * 3 + 1);
            prod[i].testaUnidade();
        }
//imprimindo os produtos 
        for (Produto i: prod) { System.out.println(i);}
    }
}
