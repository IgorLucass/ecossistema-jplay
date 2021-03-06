package game;

import classes.Ambiente;
import classes.Auxiliar;
import java.util.logging.Level;
import java.util.logging.Logger;
import jplay.*;
import javax.swing.*;
public class Main {
    
   

    public static void main(String[] args) {
      
        
           int numAtores = recebeAtores();
        Window janela = new Window(720, 848);
        Scene cena = new Scene();
        cena.loadFromFile(URL.scenario("cenario.scn"));
        Ambiente amb = new Ambiente(cena,numAtores);
        amb.alteraTile(cena);
        run(amb,cena,janela);

}
    

    private static void run(Ambiente amb,Scene cena,Window janela) {
        float velocidade = 0.4f;
        
        while (true) {

            cena.draw();
      
            if(amb.atorList.size()==1){
                amb.FinalizarJogo();
                break;
            }
            for (int i = 0; i < amb.atorList.size(); i++) {

                if(amb.isAtorDead(i)) {                 
                    System.out.println("Ator " + amb.atorList.get(i).getNome() + " sem hp, morreu");
                    amb.removeAtor(amb.atorList.get(i), cena);
                    System.out.println("Jogadores restantes: " + amb.atorList.size());
                    amb.alteraTile(cena);       
                } else {
                    amb.atorList.get(i).locomover.andar(amb.atorList.get(i), amb, cena);
                }
                
                
                amb.alteraTile(cena);
                cena.draw();
                janela.update();
                Auxiliar.pauseScript(velocidade);
            }
        }

    }
     public static int recebeAtores(){
        int numAtores;
        try{
            numAtores = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de atores"));
            if(numAtores<=1 || numAtores>13)
                throw new NumeroAtoresException("Numero precisa ser entre 2 e 13");
        }
        catch(NumeroAtoresException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
            numAtores=recebeAtores();
        }
        catch(RuntimeException e){
            JOptionPane.showMessageDialog(null,"Formato esperado: int)");
            numAtores=recebeAtores();
        }
        
        return numAtores;
        
    }
}


class NumeroAtoresException extends Exception {
    
    public NumeroAtoresException(String msg){
        super(msg);
    }

}

