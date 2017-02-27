
public class Hero extends Mutants
{


   private String name ="Kinda Bulletproof Man" ;
   int random  =(int)(Math.random() * (20-1)+1);
   int random2 =(int)(Math.random() * (40-10)+10);
   private String power = String.valueOf(random);//create the hero
   private String health = String.valueOf(random2);


   public Hero(String n, String p, String h){
   /*
      name   = n;
      power  = p;//Variables are fun.
      health = h;*/
   }
   public String toString()
   {
      return name + "/" + power + "/" + health;
   }

}
