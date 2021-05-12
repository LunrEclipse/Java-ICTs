public class Chick implements Animal
{
    private String myType;
    private String mySound;
    private String mySound2;

    public Chick(String type, String sound)
    {
        myType = type;
        mySound = sound;
        mySound2 = sound;
    }

    public Chick(String type, String sound, String sound2)
    {
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }

    public String getSound()
    {
        int index = (int)(Math.random() * 2);
        if(index == 0)
            return mySound;
        else
            return mySound2;
    }

    public String getType()
    {
        return myType; 
    }
}
