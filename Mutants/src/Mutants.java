
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;




public class Mutants{
   private List<String>          Power             = new ArrayList<String>();
   private List<String>          Health            = new ArrayList<String>();
   private String                missString        = new String("ya missed");//basic stats to be called in the run class
   private String                hitString         = new String("ya hit!");           
   private List<String>          deathEmote        = new ArrayList<String>();
   private List<String>          Damage            = new ArrayList<String>();
   
   public List getPower()
   {
      return (Power);//send them back. this applies to all get variables \/('_')\/
   }
   
   public List getHealth()
   {
      return (Health);
   }

   public String getMiss()
   {
      return (missString);
   }


   public String getHit()
   {
      return (hitString);
   }

   public List getDeath()
   {
      return (deathEmote);
   }


   public List getDamage()
   {
      return (Damage);
   }



}
