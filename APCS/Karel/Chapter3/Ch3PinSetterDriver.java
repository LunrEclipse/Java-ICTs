import kareltherobot.*;

public class Ch3PinSetterDriver implements Directions
{
    public static void main(String[] args)  
    {
        PinSetter pSetter;
        pSetter = new PinSetter (1,5,North, 10);
        pSetter.setPins();
        pSetter.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        //World.readWorld("");  ex: "ch2_6.kwld"
        World.setVisible(true);        
    }
}