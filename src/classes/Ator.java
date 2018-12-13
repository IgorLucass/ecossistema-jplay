package classes;

import java.util.Random;
import jplay.Scene;
import jplay.Sprite;
import jplay.URL;

public class Ator extends Sprite {

    protected int id;
    protected char nome;
    int energia;
    protected Sistema sistema;
    public SistemaLocomotor locomover = new SistemaLocomotor();
    SistemaDigestivo sd = new SistemaDigestivo();
    SistemaRespiratorio sr = new SistemaRespiratorio();
    Random rand = new Random();
        
   public Ator(Ambiente amb) {
        super(URL.sprite("ator0.png"), 1);
        this.nome = Gerador.getLetraRand();     
        this.id = Gerador.getTileAtorIdRand();
        this.insereEmRandomSolo(amb);
        amb.atorList.add(this);
        this.energia = Energia.INICIAL.getValor();
    }

    private void insereEmRandomSolo(Ambiente amb) {
        int posX, posY;
        
        posX = rand.nextInt(Ambiente.TAB_SIZE_MAX);
        posY = rand.nextInt(Ambiente.TAB_SIZE_MAX);
        
        while(amb.tab[posX][posY] != ID.SOLO.getCharID()) {
            posX = rand.nextInt(Ambiente.TAB_SIZE_MAX);
            posY = rand.nextInt(Ambiente.TAB_SIZE_MAX);
            
            if(amb.tab[posX][posY] == ID.SOLO.getCharID()) {
                amb.tab[posX][posY] = this.getNome();
                this.x = posX;
                this.y = posY;
                break;
            }
                                   
        }                 
    }

    public void setPosX(int x, Ambiente amb, Scene cena) {

        if (amb.atorList.contains(this)) {
            if (Auxiliar.isLetra(amb.tab[x][(int) y])) {
                Ator batalhado = atorDesafiado(amb.tab[x][(int) y], amb);
                System.out.println("Colisao, jogador " + this.nome + " come " + batalhado.nome);
                System.out.println("jogador " + amb.tab[x][(int) y] + " removido");
                amb.removeAtor(amb.getAtorInPos((int) x, (int) y), cena);
            } 
            else if(amb.tab[x][(int) y]==ID.CIGARRO.getCharID()){
                this.sr.fumar(this);
                System.out.println(this.nome + " fumou um cigarro! -40 energia");
                System.out.println("Ator " + this.nome + " energia: " + this.energia + "%");
            }
            else if(amb.tab[x][(int) y]!=ID.SOLO.getCharID()){
                System.out.println(this.nome + " comeu! +50 energia");
                this.sd.comer(this);
                System.out.println("Ator " + this.nome + " energia: " + this.energia + "%");
            }
           
            amb.tab[(int) this.x][(int) this.y] = ID.SOLO.getCharID();
            this.x = x;
            amb.tab[(int) this.x][(int) this.y] = this.nome;

        }
    }

        
            
    public void setPosXY(int x, int y, Ambiente amb, Scene cena) {
        if (Auxiliar.isAtor(x, y, amb)) {
            Ator batalhado = atorDesafiado(amb.tab[x][y], amb);
            System.out.println("Colisao, jogador " + this.nome + " come " + batalhado.nome);
            System.out.println("jogador " + amb.tab[x][(int) y] + " removido");
            amb.removeAtor(amb.getAtorInPos((int) x, y), cena);

        } 
        else if(amb.tab[x][(int) y]==ID.CIGARRO.getCharID()){
                this.sr.fumar(this);
                System.out.println(this.nome + " fumou um cigarro! -40 energia");
                System.out.println("Ator " + this.nome + " energia: " + this.energia + "%");
            }
        else if (amb.tab[x][y] != ID.SOLO.getCharID()) {
            System.out.println(this.nome + " comeu! +50 energia");
            this.sd.comer(this);
            System.out.println("Ator " + this.nome + " energia: " + this.energia + "%");
        }
        amb.tab[(int) this.x][(int) this.y] = ID.SOLO.getCharID();
        this.x = x;
        this.y = y;
        amb.tab[x][y] = this.nome;

    }
    
    public void setPosY(int y, Ambiente amb, Scene cena) {
        if (Auxiliar.isLetra(amb.tab[(int) x][y])) {
            Ator batalhado = atorDesafiado(amb.tab[(int) x][y], amb);
            System.out.println("Colisao, jogador " + this.nome + " come " + batalhado.nome);
            System.out.println("jogador " + amb.tab[(int) x][y] + " removido");
            amb.removeAtor(amb.getAtorInPos((int) x, y), cena);

        } 
        else if(amb.tab[(int)x][ y]==ID.CIGARRO.getCharID()){
                this.sr.fumar(this);
                System.out.println(this.nome + " fumou um cigarro! -40 energia");
                System.out.println("Ator " + this.nome + " energia: " + this.energia + "%");
            }
        else if (amb.tab[(int) x][y] != ID.SOLO.getCharID()) {
            System.out.println(this.nome + " comeu! +50 energia");
            this.sd.comer(this);
            System.out.println("Ator " + this.nome + " energia: " + this.energia + "%");
        }
        amb.tab[(int) this.x][(int) this.y] = ID.SOLO.getCharID();
        this.y = y;
        amb.tab[(int) this.x][(int) y] = this.nome;
    }
    
    public Ator atorDesafiado(char c, Ambiente amb) {

        for (Ator a : amb.atorList) {
            if (a.getNome() == c) {
                return a;
            }
        }
        return null;
    }
    
    public void retiraEnergia(int i) {
        energia -= i;
    }

    public void addEnergia(int i) {
        energia += i;
    }

    
    // Getters e Setters
    public void setNome(char nome) {
        this.nome = nome;
    }
    public char getNome() {
        return this.nome;
    }
    public void setPosX(double x) {
        this.x = x;
    }
    public double getPosX(){
        return this.x;
    }
    public void setPosY(double y) {
        this.y = y;
    }
    public double getPosY(){
        return this.y;
    }
    public int getEnergia() {
        return this.energia;
    }
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
}