package Exercicio2;
/**
 *
 * @author MARIANA
 */
//herdar de veiculo
public class Bicicleta extends Veiculo {
    private int numeroRodas;
    private float velocidade;

    public Bicicleta() {numeroRodas = 2;}

    public float getVelocidade() {return velocidade; }

    public int getNumeroRodas() {return this.numeroRodas; }
  
    public void acelerar(float velocidade) {
        if (velocidade > 0)
            this.velocidade += velocidade;
    }
    public void parar(){velocidade = 0;    }
  
}
