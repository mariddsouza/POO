package Exercicio2;
/**
 *
 * @author MARIANA
 */
import java.time.LocalDateTime;

public class Automovel extends Veiculo{
    private int numeroRodas;private float velocidade;
    private LocalDateTime data;

    public Automovel(){numeroRodas = 4;}

    public float getVelocidade(){return velocidade;}

    public LocalDateTime getData(){return data; }
        
    public int getNumeroRodas(){return this.numeroRodas;}
 
    public void acelerar(float velocidade){
        if (velocidade > 0)
            this.velocidade += velocidade;
    }

    public void parar(){velocidade = 0;}
        
    public void trocarOleo() {data = LocalDateTime.now();    } 
}
