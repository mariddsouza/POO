package Exercicio5;
import java.util.Random;
import Exercicio5.papel;
/**
 *
 * @author MARIANA
 */
//classe JOGO fica jogando automaticamente
public class Jogo {
    public static void main(String[] args){
        int i = 1;
        int j = 1;
        Random aleatoria = new Random();
        Object o1, o2;
        while (i > 0 && j > 0){
            i = aleatoria.nextInt(2) + 1; j = aleatoria.nextInt(2) + 1;
            o1 = switch (i){
                case 1 -> new pedra();case 2 -> new papel();case 3 -> new tesoura();
                default -> throw new IllegalStateException("" + i);
            };
            o2 = switch (j){
                case 1 -> new pedra();case 2 -> new papel();case 3 -> new tesoura();
                default -> throw new IllegalStateException("" + i);
            };
            juntou(o1, o2);
        }
    }
    public static void juntou(Object o1, Object o2){ //instanceof pois não sabe o tipo exato
        if ((o1 instanceof pedra && o2 instanceof tesoura) || (o2 instanceof pedra && o1 instanceof tesoura)){
            new pedra().quebra(); //Pedra ganha de tesoura
        } 
        else if ((o1 instanceof tesoura && o2 instanceof papel) || (o2 instanceof tesoura && o1 instanceof papel)){
            new tesoura().corta(); //tesoura ganha de papel
        } 
        else if ((o1 instanceof papel && o2 instanceof pedra) ||(o2 instanceof papel && o1 instanceof pedra)){
            new papel().envolve(); //papel ganha de pedra
        } 
        else {
            System.out.println("-------------");
            System.out.println("JOGO EMPATOU.");
        }
    }
}
