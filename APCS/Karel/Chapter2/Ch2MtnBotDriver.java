import kareltherobot.*;

public class Ch2MtnBotDriver implements Directions
{
    public static void main(String[] args)  
    {
        UrRobot mtnBot;
        mtnBot = new UrRobot (1,2,East, 1);
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.move();
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.move();
        mtnBot.putBeeper();
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.turnLeft();
        mtnBot.move();
        mtnBot.move();
        mtnBot.turnLeft();
        mtnBot.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        World.readWorld("ch2_6.kwld");
        World.setVisible(true);        
    }
}