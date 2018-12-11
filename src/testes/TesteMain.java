package testes;

import classes.Ambiente;
import classes.Auxiliar;
import jplay.*;
import javax.swing.*;

public class TesteMain {

    private Scene cena;
    private Window janela;
    Ambiente amb;

    public TesteMain(Window window) {
        // Solicitar o número de atores
        int numAtores = -1;
        while(numAtores<=0||numAtores>13)   // Lançar tratamento de erro para maior que 13
            numAtores = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de atores: "));
        janela = window;
        cena = new Scene();
        cena.loadFromFile(URL.scenario("cenario.scn"));
        amb = new Ambiente(cena,numAtores);
        amb.alteraTile(cena);
        run();
    }

    private void run() {

        while (true) {

            cena.draw();
            //janela.update();
      
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
                Auxiliar.pauseScript(0.01);
            }

//            System.out.println(amb.atorList.get(0).x + " " + amb.atorList.get(0).y);
        }

    }

    public static void main(String[] args) {
        Window janela = new Window(720, 848);
        TesteMain teste = new TesteMain(janela);
    }

}
