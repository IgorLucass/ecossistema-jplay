/*package game;

import classes.Ambiente;
import jplay.GameImage;
import jplay.Keyboard;
import jplay.URL;
import jplay.Window;

/**
 *
 * @author x0n4d0
 */
/*
public class Main {

    private static Window janela;
    private static GameImage plano;
    private static Keyboard teclado;
    
    
    public static void main(String[] args) {
        janela = new Window(800,800);
        
        plano = new GameImage(URL.sprite("menu.png"));
        //plano = new GameImage(URL.scenario("menu.png"));
        
        teclado = janela.getKeyboard();

        while(true) {
            plano.draw();
            janela.update();
           
            if(teclado.keyDown(Keyboard.ENTER_KEY)) {
                new Ambiente();
                //JOptionPane.showMessageDialog(null, "Funcionando");
            }
                
            
        }      
        
        
    }
    
}

/*
// Instanciar os atores e a interface

void gameloop() {
    - Vez do ator n
    - Verificar para onde o ator caminhou
    - Se houver outro ator:
        - Cravar uma batalha.
    - Se houver comida:
        - Adicionar a energia do ator
    - a posição que ele tava, vai receber o solo
    - a posição que ele andar, vai receber imagem dele
    - Se não houver nada, retornar o loop (n+1)



}
*/