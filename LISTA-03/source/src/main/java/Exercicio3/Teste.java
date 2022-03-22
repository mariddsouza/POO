package Exercicio3;
/**
 *
 * @author MARIANA
 */
import Exercicio3.Retangulo;
import Exercicio3.Quadrado;
import Exercicio3.Forma;
import Exercicio3.Circulo;
import java.util.ArrayList;

public class Teste{
    public static void main(String[] args) {
        ArrayList<Forma> forma = new ArrayList<>();
        Retangulo(forma);Circulo(forma);Quadrado(forma);

        for (Forma i: forma) {
            System.out.println("TIPO:" + i.getTipo());
            System.out.println("AREA: " + i.calcularArea());
        }
    }

    public static void Retangulo(ArrayList<Forma> forma) {
        Retangulo retangulo;
        
        for (int i = 0; i < 5; i++) {
            
            retangulo = new Retangulo();
            retangulo.setAltura(i * 1 + 2);
            retangulo.setLado(i * 3 + 1);
            forma.add(retangulo);
            
        }
    }

    public static void Circulo(ArrayList<Forma> forma) {
        Circulo circulo;
        
        for (int i = 0; i < 5; i++) {
            
            circulo = new Circulo();
            circulo.setRaio(i * 2 + 1);
            forma.add(circulo);
        }
    }

    public static void Quadrado(ArrayList<Forma> forma) {
        Quadrado quadrado;
        
        for (int i = 0; i < 5; i++) {
           
            quadrado = new Quadrado();
            quadrado.setAltura(i);
            forma.add(quadrado);
            
        }
    }
}
