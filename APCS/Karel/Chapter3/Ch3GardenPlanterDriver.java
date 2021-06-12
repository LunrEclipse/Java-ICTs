import kareltherobot.*;
import java.awt.*;

public class Ch3GardenPlanterDriver implements Directions
{
    public static void main(String[] args)  
    {
        GardenPlanter gPlanter;
        gPlanter = new GardenPlanter (2,2,South, 28);
        gPlanter.plantGarden();
        gPlanter.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        World.readWorld("ch3_11.kwld");
        World.setBeeperColor(new Color (124, 252, 0));
        World.setVisible(true);        
    }
}