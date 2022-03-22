package Exercicio1;
/**
 *
 * @author MARIANA
 */
import Exercicio1.Cal;

import java.lang.Math; //usando a biblioteca para a raiz quadrada 

public class CalCientifica extends Cal{
    public double sqrt(int Numero1) { return Math.sqrt(Numero1); }

    public double pow(int Numero1, int Numero2) { return Math.pow(Numero1, Numero2);}
}
