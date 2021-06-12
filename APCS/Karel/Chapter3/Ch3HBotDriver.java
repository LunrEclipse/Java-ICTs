import kareltherobot.*;
import java.awt.*;

public class Ch3HBotDriver implements Directions
{
    public static void main(String[] args)  
    {
        HBot theHBot;
        theHBot = new HBot (1,2,North, 10);
        theHBot.makeH();
        theHBot.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(10);
        World.setBeeperColor(new Color (138, 43, 226));
        World.setVisible(true);        
    }
}