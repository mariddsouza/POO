package Exercicio3;
/**
 *
 * @author MARIANA
 */
public class Quadrado extends Retangulo {
    
    public void setLado(float lado) {
        super.setLado(lado);
        super.setAltura(lado);
    }

    
    public void setAltura(float altura) {
        super.setAltura(altura);
        super.setLado(altura);
    }
    
    
    public String getTipo() {
        return "-----QUADRADO-----";
    }
}
