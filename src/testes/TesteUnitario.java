package testes;

import classes.Ambiente;
import classes.ID;

/**
 *
 * @author x0n4d0
 */
public class TesteUnitario {

    public static void main(String[] args) {
        
        char tileCharRef[] = new char[Ambiente.NUM_ARQUIVOS_IMAGEM];
       
        tileCharRef[0] = ID.SOLO.getCharID();
        tileCharRef[1] = ID.MACA.getCharID();
        tileCharRef[2] = ID.CARNE.getCharID();
        tileCharRef[3] = ID.POTION.getCharID();
        tileCharRef[4] = ID.COGUMELO.getCharID();
        tileCharRef[5] = ID.FASTFOOD.getCharID();
        tileCharRef[6] = ID.TREE.getCharID();
        
        for (int i = 0; i < tileCharRef.length; i++) {
            System.out.println("TileChar = " + tileCharRef[i]);
        }
        
        
        
    }
    
}
