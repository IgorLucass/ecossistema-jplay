package classes;

import java.util.Random;
import jplay.Scene;

public class SistemaLocomotor {

    public void andar(Ator a, Ambiente amb, Scene cena) {
        int i = Gerador.getRandom(a);

        switch (i) {
            case 4:
                a.setPosX((byte) (a.x - 1), amb, cena);
                break;
            case 7:
                a.setPosXY((int) a.x - 1, (int) a.y - 1, amb, cena);
                break;
            case 8:
                a.setPosY((byte) (a.y - 1), amb, cena);
                break;
            case 9:
                a.setPosXY((int) a.x + 1, (int) a.y - 1, amb, cena);
                break;
            case 6:
                a.setPosX((byte) (a.x + 1), amb, cena);
                break;
            case 3:
                a.setPosXY((int) a.x + 1, (int) a.y + 1, amb, cena);
                break;
            case 2:
                a.setPosY((byte) (a.y + 1), amb, cena);
                break;
            case 1:
                a.setPosXY((int) a.x - 1, (int) a.y + 1, amb, cena);
                break;
        }

        a.retiraEnergia(Energia.GASTO_LOCOMOVER.getValor());
    }

}
