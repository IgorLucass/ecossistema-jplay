package classes;

import jplay.Scene;
import java.util.Random;

//import jplay.URL;
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.Scanner;

public class Gerador {
    
    private static Random rand = new Random();
    
 
    public static char getLetraRand() {
	String ALFABETO="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	return (ALFABETO.charAt(rand.nextInt(ALFABETO.length())));
    }
    
    public static byte getPosAleatoria() {
    	return (byte)(rand.nextInt(Ambiente.TAB_SIZE_MAX));
    }
    public static byte getPosAleatoria(int inicio,int fim) {
        byte i = (byte) (rand.nextInt(fim-inicio)+inicio);
        System.out.println(i);
    	return (byte)(i);
    }

    public static int getTileAtorIdRand() {
        int min = ID.ATOR0.getIntID();
        int max = ID.ATOR12.getIntID();
               
        return (rand.nextInt(max-min) + min);
    }
    
    public static String getNomeArquivo(int idAtor) {
        return "ator"+idAtor+".png";
    }
    
    public static int getRandom(Ator a) {
        int aux[] = {1, 2, 3, 4, 6, 7, 8, 9};
        if (a.x == 0 && a.y == 0) {
            int[] aux2 = {2, 3, 6};
            return aux2[new Random().nextInt(aux2.length)];

        }
        if (a.x == 0 && a.y == 15) {
            int[] aux2 = {8, 9, 6};
            return aux2[new Random().nextInt(aux2.length)];
        }

        if (a.x == 15 && a.y == 0) {
            int[] aux2 = {1, 4, 2};
            return aux2[new Random().nextInt(aux2.length)];
        }
        if (a.x == 15 && a.y == 15) {
            int[] aux2 = {7, 8, 4};
            return aux2[new Random().nextInt(aux2.length)];
        } else if (a.x == 0) {
            int[] aux2 = {8, 9, 6, 3, 2};
            return aux2[new Random().nextInt(aux2.length)];

        } else if (a.y == 0) {
            int[] aux2 = {4, 1, 6, 3, 2};
            return aux2[new Random().nextInt(aux2.length)];
        } else if (a.x == 15) {
            int[] aux2 = {4, 1, 7, 8, 2};
            return aux2[new Random().nextInt(aux2.length)];
        } else if (a.y == 15) {
            int[] aux2 = {4, 6, 7, 8, 9};
            return aux2[new Random().nextInt(aux2.length)];
        } else {
            return aux[new Random().nextInt(aux.length)];
        }
    }
   
}