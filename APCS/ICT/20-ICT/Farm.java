import java.util.*;

public class Farm
{
      private ArrayList <Animal> myFarm;
	
	   public Farm() 
		{
		   myFarm = new ArrayList <Animal>();
		   myFarm.add(new NamedCow("cow","Elsie","moo"));
		   myFarm.add(new Chick("chick","cheep","cluck"));
         myFarm.add(new Pig("pig","oink"));
	   }
	
	   public void animalSounds()
      {
		   Animal temp;
		   for(int i = 0; i < myFarm.size(); i++)
         {
			   temp = myFarm.get(i);
			   System.out.println(temp.getType() + " goes " + temp.getSound());
		   }
		    
		   NamedCow named = (NamedCow)myFarm.get(0);
		   System.out.println("The cow is known as " + named.getName() + "\n");
		
	}
}
