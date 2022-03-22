package Exercicio3;
/**
 *
 * @author MARIANA
 */
public class Circulo extends Forma{
    
    private float raio;

    public float getRaio() {return raio;}

    public void setRaio(float raio) {this.raio = raio;}

    public float calcularArea() {return ((float) (Math.PI * Math.pow(raio, 2)));}

    public float calcularPerimetro() { return ((float) (2 * Math.PI * raio));}

    public String getTipo() {
        return "-----CIRCULO-----";
    }
}
