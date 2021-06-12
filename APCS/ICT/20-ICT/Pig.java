public class Pig implements Animal
{
  private String myType;
  private String mySound;

  public Pig(String type, String sound)
  {
    myType = type;
    mySound = sound;
  }

  public String getSound()
  {
 return mySound; 
  }

  public String getType()
  {
 return myType; 
  }
}
