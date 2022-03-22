
package All.persistence;
import All.model.BitsString;
/**
 *
 * @author Mariana Souza - 3898
 */
public class BitsStringDAO{
    final private BitsString bits;
    public BitsStringDAO(int size){
        bits = new BitsString(size);
    }

    public void inserirBit(int posicao, String valor){
        bits.setArray(posicao, valor);
    }

    public String[] getArray(){
        return bits.getArray();
    }

    public String recuperarBit(int posicao){
        return bits.getBit(posicao);
    }

    public String listarBits(){
        return bits.toString();
    }

    public int tamanho(){
        return bits.size();
    }

}
