import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Math;
import java.lang.String;
public class run{


   public static void main(String[] args){
    
      String name = new String();
      String power = new String();//Strings for the hero
      String health = new String();
      
      String name2 = new String();
      String power2 = new String();//Strings for the villain
      String health2 = new String();
   
      Hero Hero = new Hero(name,power,health);
      ArrayList<Hero> superHeroes = new ArrayList<Hero>();//creates the array
      Hero hClass = new Hero(name, power, health);//what specifically we want
      superHeroes.add(hClass);//add it
      System.out.println(Hero.toString());//output the full array
   
      
      
      
      Villain Villain = new Villain(name2,power2,health2);
      ArrayList<Villain> superVillains = new ArrayList<Villain>();//create the array
      Villain vClass = new Villain(name2, power2, health2);//again, what we are creating
      superVillains.add(vClass);//add it
      System.out.println(Villain.toString());//output the full array
   
   
        
      int RNG           = (int)Math.random() * (3-1)+1;//random number generator.
   
   
   
      
     
   
   }
   

}