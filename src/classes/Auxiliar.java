package classes;

import java.util.Random;
import jplay.Scene;


public class Auxiliar {
    
    Random rand = new Random();
    
    public static void pauseScript(double tSeg) {
        try {
            Thread.sleep((long) (tSeg * 1000));
        } catch (InterruptedException e) {

        }
    }
    
    public static boolean isNumNegativo(int valor) {
	return (valor < 0);
    }  
		
    public static boolean isLetra(char ch) {
    	return (Character.isLetter(ch));
    }

    public static byte getMaior(int x, int y) {
    	if(x > y)	return (byte)0;
    	else if(x < y)	return (byte)1;
    	else	return (byte)-1;
    }
    
    public static boolean isAtor(int x, int y, Ambiente ambiente) {
        return isLetra(ambiente.tab[x][y]);
    }
    
}
