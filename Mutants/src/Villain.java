

public class Villain extends Mutants
{
   int RNG           = (int)Math.random() * (3-1)+1;//random number generator.

   private String name2 = "Extinction";
   int random  =(int)(Math.random() * (20-1)+1);
   int random2 =(int)(Math.random() * (40-10)+10);
   private String power2 = String.valueOf(random);//create the hero
   private String health2 = String.valueOf(random2);

   public Villain(String n, String p, String h){
   /*
      name2 = n;
      power2 = p;//same as heroes
      health2 = h;*/
   }
   public String toString()
   {
      return name2 + "/" + power2 + "/" + health2;
   }

     
      
}
