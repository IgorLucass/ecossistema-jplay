package classes;

public class SistemaDigestivo {

    boolean comer(Ator a,Ator b,Ambiente amb){
         if (a==null || b==null)
             System.out.println("nulo");
         else if(a.energia<=b.energia )
           {
         amb.atorList.remove(b);
          a.addEnergia(50);
           }
         else {
               amb.atorList.remove(a);
               b.addEnergia(50);
         }
         return false;
   
    }
    protected void comer(Ator a)
    {
        a.addEnergia(50);
    }

}
