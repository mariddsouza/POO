
package All.persistence;
import All.model.Bits;
/**
 *
 * @author Mariana Souza - 3898
 */
public class BitsDAO{
    final private Bits bits;
    
    public BitsDAO(int size){
        bits = new Bits(size);
    }
    
    public void inserirBit(int posicao,int valor){
        bits.setArray(posicao, valor);
    }
    
    public int[] getArray(){
        return bits.getArray();
    }
    
    public int recuperarBit(int posicao){
        return bits.getBit(posicao);
    }
    
    public String listarBits(){
        return bits.toString();
    }
    
    public int tamanho(){
        return bits.size();
    }
}
