import kareltherobot.*;

public class Ch2HBotDriver implements Directions
{
    public static void main(String[] args)  
    {
        UrRobot hBot;
        hBot = new UrRobot (1,2,North, 7);
        hBot.putBeeper();
        hBot.move();
        hBot.putBeeper();
        hBot.move();
        hBot.putBeeper();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.move();
        hBot.turnLeft();
        hBot.move();
        hBot.putBeeper();
        hBot.move();
        hBot.putBeeper();
        hBot.turnLeft();
        hBot.move();
        hBot.putBeeper();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.move();
        hBot.move();
        hBot.putBeeper();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.move();
        hBot.move();
        hBot.move();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.turnLeft();
        hBot.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        //World.readWorld("");  ex: "ch2_6.kwld"
        World.setVisible(true);        
    }
}