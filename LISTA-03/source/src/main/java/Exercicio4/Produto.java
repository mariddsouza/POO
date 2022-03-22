package Exercicio4;
/**
 *
 * @author MARIANA
 */
public class Produto {
    private int serial;
    private int vol;
    private String Test;

    public Produto(int serial) {
        setSerial(serial);
        Test = "não testado";
    }
    public int getSerial() {return serial;}

    public void setSerial(int serial) {this.serial = serial;}

    public int getVol() {return vol;}

    public void setVol(int volume) {this.vol = volume;}

    public String getTest() {return Test;}

    public void setTest(String test) {this.Test = test;}

    public boolean testaUnidade() {
        double num = Math.random(); //gerando aleatorio de 0.0 a 1.0 
        if (num <= 0.9) {
            
            setTest("APROVADO");
            return false;
            
        } else {
            
            setTest("APROVADO");
            return true;
            
        }
    }
    
    public String toString() { //retornando o num serial, vol e result teste
        return "PRODUTO{" + "SERIAL=" + serial + ", VOLUME=" + vol + ", TESTE='" + Test + '\'' + '}';
    }
}
