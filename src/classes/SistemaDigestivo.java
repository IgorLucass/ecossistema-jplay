package classes;

public class SistemaDigestivo {

    boolean comer(Ator a,Ator b,Ambiente amb){
         if (a==null || b==null)
             System.out.println("nulo");
         else if(a.energia<=b.energia ) {
            a.addEnergia(b.getEnergia());
            amb.atorList.remove(b);
         } else {
             b.addEnergia(a.getEnergia());
             amb.atorList.remove(a);
         }
         return false;
   
    }
    protected void comer(Ator a)
    {
        a.addEnergia(Energia.COMIDA.getValor());
    }

}
