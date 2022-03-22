package Exercicio3;

/**
 *
 * @author MARIANA
 */
import Exercicio3.Forma;

public class Retangulo extends Forma {
    private float lado;
    private float altura;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
    public float calcularArea() {
        return lado * altura;
    }

   
    public float calcularPerimetro() {
        return (lado * 2) + (altura * 2);
    }

    
    public String getTipo() {
        return "-----RETANGULO-----";
    }
}
