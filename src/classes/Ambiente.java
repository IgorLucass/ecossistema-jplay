package classes;

import java.util.ArrayList;
import java.util.Random;
import jplay.Scene;

public class Ambiente {

    public char tab[][];
    protected byte idRodada;
    public ArrayList<Ator> atorList = new ArrayList();
    private final Random rand = new Random();

    public static final int NUM_ARQUIVOS_IMAGEM = 20;
    public static final int TAB_SIZE_MAX = 16;
    public static final int TAB_SIZE_MIN = 0;
   
   public Ambiente(Scene cena, int numAtores) {
       
       this.tab = new char[TAB_SIZE_MAX][TAB_SIZE_MAX];
       
       for (int i = 0; i < TAB_SIZE_MAX; i++) 
        for (int j = 0; j < TAB_SIZE_MAX; j++) 
                this.tab[i][j] = ' ';
       
       this.gerarAmbiente(cena);
       this.gerarAtores(numAtores);
       
   }

   public void gerarAmbiente(Scene cena){
        int numTiles = 0;
        int i,j;
        
        char tileCharRef[] = new char[Ambiente.NUM_ARQUIVOS_IMAGEM];
       
        tileCharRef[0] = ID.SOLO.getCharID();
        tileCharRef[1] = ID.MACA.getCharID();
        tileCharRef[2] = ID.CARNE.getCharID();
        tileCharRef[3] = ID.POTION.getCharID();
        tileCharRef[4] = ID.COGUMELO.getCharID();
        tileCharRef[5] = ID.FASTFOOD.getCharID();
        tileCharRef[6] = ID.TREE.getCharID();
        tileCharRef[7] = ID.CIGARRO.getCharID();
        
        numTiles = 8;
        
       // Insere os charIDs no ambiente 
    	for(i = 0; i < TAB_SIZE_MAX; i++) { 
            for(j = 0; j < TAB_SIZE_MAX; j++) {
                this.tab[i][j] = tileCharRef[rand.nextInt(numTiles)];
            }
        }    
        
    }
    
    private void gerarAtores(int numAtores) {
        for(int i =0; i<numAtores;i++)
            addAtor();
    }
    
    public void addAtor() {
        Ator a = new Ator(this);
    }
    
    //@Override
    public void removeAtor(Ator a, Scene cena) {
        System.out.println("Ator removido em xy " + a.x + a.y);
        this.tab[(int)a.x][(int) a.y] = ID.SOLO.getCharID();
        atorList.remove(atorList.indexOf(a));
    }
    
    //@Override
    public void exibirNoConsole() {
        for (int i = 0; i < TAB_SIZE_MAX; i++) {
            for (int j = 0; j < TAB_SIZE_MAX; j++) {
                System.out.printf("|"+tab[i][j]);
            }
            System.out.println("|");
        }
    }
    
    public Ator getAtorInPos(int x, int y) {
        
        for(Ator ator : this.atorList) {
            if(this.tab[x][y] == ator.getNome())
                return ator;
        }
        return null;
    }
    
    public void alteraTile(Scene cena) {
        for(int x=0;x<16;x++) {
            for (int y = 0; y < 16; y++) {
                this.insereTile(cena, x, y);
            }
        }

    }
    
    public void insereTile(Scene cena, int posX, int posY) {
        int tileID;
        char tileChar = this.tab[posX][posY];
       
        if(tileChar == ID.SOLO.getCharID()) tileID = ID.SOLO.getIntID();
        else if(tileChar == ID.MACA.getCharID()) tileID = ID.MACA.getIntID();
        else if(tileChar == ID.CARNE.getCharID()) tileID = ID.CARNE.getIntID();
        else if(tileChar == ID.POTION.getCharID()) tileID = ID.POTION.getIntID();
        else if(tileChar == ID.COGUMELO.getCharID()) tileID = ID.COGUMELO.getIntID();
        else if(tileChar == ID.FASTFOOD.getCharID()) tileID = ID.FASTFOOD.getIntID();
        else if(tileChar == ID.TREE.getCharID()) tileID = ID.TREE.getIntID();
        else if(tileChar == ID.CIGARRO.getCharID()) tileID = ID.CIGARRO.getIntID();
        else tileID=getAtorInPos(posX,posY).getId();    
       
        cena.changeTile(posX, posY, tileID);
    }
    
    public void insereTile(Scene cena, int posX, int posY, int tileID) {
        cena.changeTile(posX, posY, tileID);
    }
    
    private boolean isEmpty(int x, int y) {
        return this.tab[x][y] == ID.SOLO.getCharID();
    }
    
    public boolean isAtorDead(int i) {
        return this.atorList.get(i).getEnergia() <= 0;
    }
    
    public void FinalizarJogo() {
        System.out.println("Ator " + atorList.get(0).nome + " ganhou!");
       
   }

    // Getters e Setters:
    public void setChar(char charEntrada, byte x, byte y) {
        this.tab[x][y] = charEntrada;
    }
    public char getChar(byte x, byte y) {
    	return (this.tab[x][y]);     	
    }      
    public byte getIdRodada() {
        return idRodada;
    }
    public void setIdRodada(byte idRodada) {
        this.idRodada = idRodada;
    }

    
}
