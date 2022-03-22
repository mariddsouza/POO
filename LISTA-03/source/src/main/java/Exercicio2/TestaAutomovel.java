package Exercicio2;
/**
 *
 * @author MARIANA
 */

import Exercicio2.Bicicleta;
import Exercicio2.Automovel;

public class TestaAutomovel {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[2];
        veiculos[0] = new Bicicleta();
        veiculos[1] = new Automovel();

        veiculos[0].acelerar(10);
        veiculos[1].acelerar(20);

        System.out.println(veiculos[0].getNumeroRodas());
        System.out.println(veiculos[1].getNumeroRodas());

        for (Veiculo i: veiculos) {
            if (i instanceof Automovel) {
                ((Automovel) i).trocarOleo();
                System.out.println(((Automovel) i).getData());
            }
        }
    }
}
