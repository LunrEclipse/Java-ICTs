import kareltherobot.*;

public class MazeBeast implements Directions
{
    public static void main(String[] args)
    {
        MazeWalker jeff;
        jeff = new MazeWalker(1,1,East, 0);        
        while(!jeff.nextToABeeper())
        {
            jeff.followWallRight();
        }
        jeff.pickBeeper();
        jeff.turnOff();
    }
    
    static
    {
        World.reset();
        World.setDelay(0);
        World.readWorld("mazeBeast.kwld");
        World.setVisible(true);
    }
}