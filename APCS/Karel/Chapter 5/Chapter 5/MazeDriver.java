import kareltherobot.*;

public class MazeDriver implements Directions
{
    public static void main(String[] args)
    {
        MazeWalker bot1;
        bot1 = new MazeWalker(2,7,North, 0);
        
        MazeWalker bot2;
        bot2 = new MazeWalker(2,2,North, 0);
        
        MazeWalker bot3;
        bot3 = new MazeWalker(7,2,North, 0);
        
        MazeWalker bot4;
        bot4 = new MazeWalker(7,7,North, 0);
        
        bot1.followWallRight();
        bot1.turnOff();
        
        bot2.followWallRight();
        bot2.turnOff();
        
        bot3.followWallRight();
        bot3.turnOff();
        
        bot4.followWallRight();
        bot4.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(15);
        World.readWorld("ch5_9.kwld");
        World.setVisible(true);
    }
}