import kareltherobot.*;

public class Ch3DiamondPlanterDriver implements Directions
{
    public static void main(String[] args)  
    {
        DiamondPlanter thePlanter;
        thePlanter = new DiamondPlanter (1,5,North, infinity);
        thePlanter.plantDiamond();
        thePlanter.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        //World.readWorld("");  ex: "ch2_6.kwld"
        World.setVisible(true);        
    }
}