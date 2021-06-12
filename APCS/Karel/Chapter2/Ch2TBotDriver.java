import kareltherobot.*;

public class Ch2TBotDriver implements Directions
{
    public static void main(String[] args)  
    {
        UrRobot tBot;
        tBot = new UrRobot (1,1,North, 0);
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.turnLeft();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.pickBeeper();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.turnLeft();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.turnLeft();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.putBeeper();
        tBot.move();
        tBot.turnLeft();
        tBot.turnLeft();
        tBot.turnOff();

    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        World.readWorld("test.kwld");
        World.setVisible(true);        
    }
}