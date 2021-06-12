import kareltherobot.*;

public class ReviewDriver implements Directions
{
    public static void main(String[] args)  
    {
        Review tBot;
        tBot = new Review (1,1,South, 2);
        tBot.turnLeft();
        tBot.moveFourAndDrop();
        tBot.turnAround();
        tBot.move();
        tBot.move();
        tBot.move();
        tBot.putBeeper();
        tBot.move();
        tBot.turnRight();
        tBot.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        //World.readWorld("");  ex: "ch2_6.kwld"
        World.setVisible(true);        
    }
}